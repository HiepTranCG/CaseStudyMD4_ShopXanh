package com.example.casestudymd4_shopxanh.repository;


import com.example.casestudymd4_shopxanh.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

}