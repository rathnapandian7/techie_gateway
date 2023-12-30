package org.example.service;


import org.example.model.StateMaster;
import org.example.repository.StateMasterRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateMasterServcie {
    @Autowired
    StateMasterRespository stateMasterRespository;

    public void saveStateMaster(StateMaster stateMaster) {
        stateMasterRespository.save(stateMaster);
    }
    public StateMaster getStateMaster(Long id) {
        return stateMasterRespository.findById(id).get();
    }

}
