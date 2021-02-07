package com.victor.microservices.suppliers.repository;

import com.victor.microservices.suppliers.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Supplier findByState(String state);

}
