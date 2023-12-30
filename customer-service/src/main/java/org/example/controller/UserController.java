package org.example.controller;


import org.example.dto.Response;
import org.example.dto.UserDetailsDto;
import org.example.model.UserDetailsModel;
import org.example.service.UserDetailService;
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
