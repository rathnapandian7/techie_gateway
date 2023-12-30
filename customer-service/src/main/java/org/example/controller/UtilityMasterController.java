package org.example.controller;


import org.example.model.UtilityMaster;
import org.example.service.UtilityMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utility")
public class UtilityMasterController {

    @Autowired
    UtilityMasterService utilityMasterService;

    @PostMapping("/createUtility")
    public void createUtilityMaster(@RequestBody UtilityMaster utilityMaster) {
        utilityMasterService.saveUtility(utilityMaster);
    }
    @GetMapping("/getUtility")
    public UtilityMaster getUtilityMaster(@RequestParam Long utilityId) {
        return utilityMasterService.saveUtility(utilityId);
    }
}
