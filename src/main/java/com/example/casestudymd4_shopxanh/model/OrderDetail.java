package com.example.casestudymd4_shopxanh.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;
    private Long amount;
    private Long money;
}
