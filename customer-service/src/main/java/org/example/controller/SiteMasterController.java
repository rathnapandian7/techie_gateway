package org.example.controller;

import org.example.model.SiteMaster;
import org.example.service.SiteMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/site")
public class SiteMasterController {
    @Autowired
    SiteMasterService siteMasterService;

    @PostMapping("/createSite")
    public void createSiteMaster(@RequestBody SiteMaster siteMasterRequest) {
        siteMasterService.createSiteMaster(siteMasterRequest);
    }

    @GetMapping("/getSite")
    public SiteMaster getSiteMaster(@RequestParam Long siteId) {
        return siteMasterService.getSiteMaster(siteId);
    }
}
