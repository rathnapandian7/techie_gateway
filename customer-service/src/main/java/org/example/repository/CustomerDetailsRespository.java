package org.example.repository;

import org.example.model.CustomerDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailsRespository extends JpaRepository<CustomerDetailsModel, Long> {


    @Query(value = "select next_val from CUSTOMER_SEQUENCE", nativeQuery = true)
    public Integer getCustomerSequence();
}
