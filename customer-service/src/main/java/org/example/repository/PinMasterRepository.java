package org.example.repository;


import org.example.model.PinMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinMasterRepository extends JpaRepository<PinMaster,Long> {

}
