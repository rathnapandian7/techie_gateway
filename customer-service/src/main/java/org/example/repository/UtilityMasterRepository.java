package org.example.repository;

import org.example.model.UtilityMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityMasterRepository extends JpaRepository<UtilityMaster,Long> {
}
