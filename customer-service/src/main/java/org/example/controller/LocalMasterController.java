package org.example.controller;


import org.example.model.LocalMaster;
import org.example.service.LocalMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/local")
public class LocalMasterController {

    @Autowired
    LocalMasterService localMasterService;

    @PostMapping("/createLocal")
    public void createLoacalMaster(@Validated @RequestBody LocalMaster localMaster) {
        localMasterService.saveLocalMaster(localMaster);

    }

    @GetMapping("/getLocal")
    public LocalMaster getLoacalMaster(@RequestParam Long localId) {
        return localMasterService.getLocalMaster(localId);

    }
}
