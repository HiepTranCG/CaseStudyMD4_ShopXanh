package com.example.casestudymd4_shopxanh.repository;

import com.example.casestudymd4_shopxanh.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameContaining(String name);

    @Query(value = "select * from product order by id desc limit 1", nativeQuery = true)
    Product findLastProduct();

}
