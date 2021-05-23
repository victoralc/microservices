package com.victor.microservices.suppliers.service;

import com.victor.microservices.suppliers.model.Supplier;
import com.victor.microservices.suppliers.model.SupplierDTO;
import com.victor.microservices.suppliers.repository.SupplierRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public Supplier getSupplierInfo(String state){
        return this.supplierRepository.findByState(state);
    }

    public Supplier createSupplier(SupplierDTO supplierDTO) {
        return this.supplierRepository.save(new Supplier(supplierDTO));
    }

}
