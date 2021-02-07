package com.victor.microservices.suppliers.controller;

import com.victor.microservices.suppliers.model.Supplier;
import com.victor.microservices.suppliers.service.SupplierService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/info/{state}")
    public Supplier getSupplierInfo(@PathVariable String state){
        return this.supplierService.getSupplierInfo(state);
    }
}
