package org.example.service;

import org.example.model.UtilityMaster;
import org.example.repository.UtilityMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilityMasterService {

    @Autowired
    UtilityMasterRepository utilityMasterRepository;

    public void saveUtility(UtilityMaster utilityMaster) {
        utilityMasterRepository.save(utilityMaster);
    }

    public UtilityMaster saveUtility(Long id) {
        return utilityMasterRepository.findById(id).get();
    }
}
