package org.example.repository;


import org.example.model.ZoneMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneMasterRepository extends JpaRepository<ZoneMaster,Long> {
}
