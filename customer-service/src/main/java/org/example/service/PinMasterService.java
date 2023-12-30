package org.example.service;


import org.example.model.PinMaster;
import org.example.repository.PinMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PinMasterService {


    @Autowired
    PinMasterRepository pinMasterRepository;

    public void savePinMaster(PinMaster pinMaster){
        pinMasterRepository.save(pinMaster);

    }
}
