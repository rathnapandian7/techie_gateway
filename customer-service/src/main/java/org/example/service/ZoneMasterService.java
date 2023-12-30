package org.example.service;

import org.example.model.ZoneMaster;
import org.example.repository.ZoneMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneMasterService {

    @Autowired
    ZoneMasterRepository zoneMasterRepository;

    public void saveZoneMaster(ZoneMaster zoneMaster) {
        zoneMasterRepository.save(zoneMaster);
    }

    public ZoneMaster getZoneMaster(Long id) {
        return zoneMasterRepository.findById(id).get();
    }
}
