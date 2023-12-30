package org.customer.service.controller;


import org.customer.service.model.Citymaster;
import org.customer.service.service.CityMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city")
public class CityMasterController {

    @Autowired
    CityMasterService cityMasterService;

    @PostMapping("/createCity")
    public void createCityMater(@RequestBody Citymaster citymaster) {
        cityMasterService.saveCityMaster(citymaster);
    }

    @GetMapping("/getCity")
    public Citymaster getCityMater(@RequestParam Long cityId) {
        return cityMasterService.getCityMaster(cityId);
    }
}
