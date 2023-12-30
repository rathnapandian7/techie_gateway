package org.example.service;
import org.example.model.CountryMaster;
import org.example.repository.CountryMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryMasterService {

    @Autowired
    CountryMasterRepository countryMasterRepository;

    public void saveCountry(CountryMaster countryMaster) {
        countryMasterRepository.save(countryMaster);
    }
}
