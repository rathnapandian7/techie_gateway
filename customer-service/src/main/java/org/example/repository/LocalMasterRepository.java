package org.example.repository;


import org.example.model.LocalMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalMasterRepository extends JpaRepository<LocalMaster,Long> {

}
