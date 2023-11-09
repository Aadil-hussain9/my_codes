package com.eshop.eshopbackend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "PRODUCT_DETAILS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ProductId;

    @Column(name = "PRODUCT_NAME")
    private String ProductName;
    @Column(name = "PRICE")
    private long price;

    @Column(name = "QUANTITY")
    private long quantity;
}
