package com.example.casestudymd4_shopxanh.repository;

import com.example.casestudymd4_shopxanh.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
