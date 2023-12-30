package org.example.repository;

import org.example.model.UserDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMasterRepository extends JpaRepository<UserDetailsModel, Long> {

    @Query(value = "select next_val from USER_SEQUENCE", nativeQuery = true)
    int getUserSequence();
}