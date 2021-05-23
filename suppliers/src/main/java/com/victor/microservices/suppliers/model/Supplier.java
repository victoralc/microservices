package com.victor.microservices.suppliers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String state;
    private String address;

    public Supplier() {}

    public Supplier(String name, String state, String address) {
        this.name = name;
        this.state = state;
        this.address = address;
    }

    public Supplier(SupplierDTO supplierDTO) {
        this.name = supplierDTO.getName();
        this.state = supplierDTO.getState();
        this.address = supplierDTO.getAddress();
    }
}
