package org.example.controller;

import org.example.model.PinMaster;
import org.example.service.PinMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pin")
public class PinMasterController {

    @Autowired
    PinMasterService pinMasterService;

    @PostMapping("/createPin")
    public void createPin(PinMaster pinMaster){
        pinMasterService.savePinMaster(pinMaster);
    }

}
