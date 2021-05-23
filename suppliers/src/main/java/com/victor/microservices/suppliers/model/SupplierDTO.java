package com.victor.microservices.suppliers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class SupplierDTO {

    private Long id;
    private String name;
    private String state;
    private String address;


}
