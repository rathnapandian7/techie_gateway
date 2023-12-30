package org.customer.service.controller;


import org.customer.service.dto.CustomerDetailsDto;
import org.customer.service.dto.UserDetailsDto;
import org.customer.service.model.CustomerDetailsModel;
import org.customer.service.model.UserDetailsModel;
import org.customer.service.response.Response;
import org.customer.service.service.CustomerService;
import org.customer.service.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDetailService service;


    @GetMapping("/getUser")
    public UserDetailsDto getCustomerDetails(@RequestParam Long custId) throws Exception {
        return service.getUserDetails(custId);
    }


    @PostMapping("/createUser")
    public Response createCustomer(@RequestBody UserDetailsModel customerDetailsModel) throws Exception {
        return service.createUser(customerDetailsModel);


    }
}
