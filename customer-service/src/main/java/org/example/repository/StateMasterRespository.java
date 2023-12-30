package org.example.repository;


import org.example.model.StateMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateMasterRespository extends JpaRepository<StateMaster,Long> {


}
