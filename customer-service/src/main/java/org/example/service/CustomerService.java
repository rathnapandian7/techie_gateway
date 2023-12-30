package org.example.service;

import org.example.dto.CustomerDetailsDto;
import org.example.dto.Response;
import org.example.model.CustomerDetailsModel;
import org.example.repository.CustomerDetailsRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    @Autowired
    CustomerDetailsRespository repo;

    public CustomerDetailsDto getCustomerDetails(Long custId) {
        Response<CustomerDetailsDto> response = new Response<>();
        CustomerDetailsDto customerDto = new CustomerDetailsDto();
        log.info("get customer details for customerId " + custId);
        try {
            Optional<CustomerDetailsModel> customerDetailsModel = repo.findById(custId);
            if (customerDetailsModel.isPresent()) {
                CustomerDetailsModel customerDetailsObj = customerDetailsModel.get();
                customerDto.setId(customerDetailsObj.getId());
                customerDto.setCustomerName(customerDetailsObj.getCustomerName());
                customerDto.setCustomerMailId(customerDetailsObj.getCustomerMailId());
                customerDto.setCustomerIsActive(customerDetailsObj.getCustomerIsActive());
                customerDto.setUserDetailsModelList(customerDetailsObj.getUserDetailsModelHashSet());
//                customerDto.setSiteMasterList(customerDetailsObj.getSiteMasterList());
                customerDetailsObj.getUserDetailsModelHashSet().stream().peek(user -> user.setCustomerId(user.getCutomerCustomerDetailsModel().getId())).collect(Collectors.toList());
                response.setData(customerDto);
                response.setStatus(HttpStatus.OK.value());
                log.info(" customer details Created successfully{}");
            }else{
                //response.setStatus();
            }
        } catch (Exception e) {
            log.error("customer details creation failed due to{}" + e.getCause());
         //   throw new CustomerCreationException("can't able to create customer due to " + e.getMessage());
        }

        return customerDto;

    }

    public Response createCustomer(CustomerDetailsModel customerDetailsModel) {
        try {


            int nextVal = repo.getCustomerSequence();
            customerDetailsModel.setPrefixCUstomerId("C-" + String.valueOf(nextVal));
            repo.save(customerDetailsModel);
            Response response = new Response<>();
            response.setMessage("customer detail created successfully");
            response.setStatus(HttpStatus.OK.value());
            log.info("customer detail created successfully");
            return response;
        } catch (Exception e) {
            log.error("customer creation failed due to " + e.getCause());
        }
        return null;
    }


}
