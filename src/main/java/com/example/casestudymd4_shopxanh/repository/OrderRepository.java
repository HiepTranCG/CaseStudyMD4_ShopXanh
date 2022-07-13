package com.example.casestudymd4_shopxanh.repository;

import com.example.casestudymd4_shopxanh.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}