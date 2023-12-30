package org.example.controller;

import org.example.model.ZoneMaster;
import org.example.service.ZoneMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zone")
public class ZoneMasterController {

    @Autowired
    ZoneMasterService zoneMasterService;

    @PostMapping("/createZone")
    public void createZone(@RequestBody ZoneMaster zoneMaster) {
        zoneMasterService.saveZoneMaster(zoneMaster);

    }
    @GetMapping("/getZone")
    public ZoneMaster getZone(@RequestParam Long zoneId) {
       return zoneMasterService.getZoneMaster(zoneId);

    }
}
