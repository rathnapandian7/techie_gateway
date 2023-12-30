package org.customer.service.service;

import org.customer.service.model.LocalMaster;
import org.customer.service.repository.LocalMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocalMasterService {


    @Autowired
    LocalMasterRepository localMasterRepository;

    public void saveLocalMaster(LocalMaster localMaster) {
        localMasterRepository.save(localMaster);
    }

    public LocalMaster getLocalMaster(Long id) {
        Optional<LocalMaster> locl=localMasterRepository.findById(id);
        if(locl.isPresent()){
            return locl.get();
        }
        return null;
    }
}
