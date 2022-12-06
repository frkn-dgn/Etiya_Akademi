package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "total")
    private double total;

    @Column(name = "coupon")
    private String coupon;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnoreProperties("orderDetails")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties("orderDetails")
    private Product product;
}
