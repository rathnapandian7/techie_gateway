package org.example.repository;

import org.example.model.Citymaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMasterRepository extends JpaRepository<Citymaster,Long> {

}
