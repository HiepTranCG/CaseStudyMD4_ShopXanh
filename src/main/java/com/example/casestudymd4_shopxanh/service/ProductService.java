package com.example.casestudymd4_shopxanh.service;

import com.example.casestudymd4_shopxanh.model.Product;

public interface ProductService extends IService<Product> {
    Product findLastProduct();
}
