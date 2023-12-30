package org.example.controller;


import org.example.model.StateMaster;
import org.example.service.StateMasterServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/state")
public class StateMasterController {

    @Autowired
    StateMasterServcie stateMasterServcie;

    @PostMapping("/createState")
    public void createState(@RequestBody StateMaster stateMaster) {
        stateMasterServcie.saveStateMaster(stateMaster);
    }

    @GetMapping("/getState")
    public StateMaster getState(@RequestParam Long stateId) {
        return stateMasterServcie.getStateMaster(stateId);
    }

}
