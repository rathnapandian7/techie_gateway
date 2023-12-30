package org.example.service;



import org.example.model.RoleMaster;
import org.example.repository.RoleMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMasterService {

    @Autowired
    RoleMasterRepository roleMasterRepository;


    public void createRoleMaster(RoleMaster roleMaster){
        roleMasterRepository.save(roleMaster);
    }
    public RoleMaster getRoleMaster(Long roleId){
       return roleMasterRepository.findById(roleId).get();
    }
}
