package org.customer.service.controller;

import org.customer.service.model.RoleMaster;
import org.customer.service.service.RoleMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleMasterController {
    @Autowired
    RoleMasterService roleMasterService;


    @PostMapping("/createRole")
    public void createRoleMaster(@RequestBody RoleMaster roleMaster) {
        roleMasterService.createRoleMaster(roleMaster);

    }
    @GetMapping("/getRole")
    public RoleMaster getRoleMaster(@RequestParam Long roleId) {
      return roleMasterService.getRoleMaster(roleId);

    }

}
