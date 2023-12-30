package org.example.controller;

import org.example.dto.CustomerDetailsDto;
import org.example.dto.Response;
import org.example.model.CustomerDetailsModel;
import org.example.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    public static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService service;


    @GetMapping("/getCustomer")
    public CustomerDetailsDto getCustomerDetails(@RequestParam Long custId) throws Exception {
        return service.getCustomerDetails(custId);
    }


    @PostMapping("/create")
    public Response createCustomer(@RequestBody CustomerDetailsModel customerDetailsModel) throws Exception {
        return service.createCustomer(customerDetailsModel);


    }
}
