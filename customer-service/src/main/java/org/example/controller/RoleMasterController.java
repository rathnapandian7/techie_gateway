package org.example.controller;

import org.example.model.RoleMaster;
import org.example.service.RoleMasterService;
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
