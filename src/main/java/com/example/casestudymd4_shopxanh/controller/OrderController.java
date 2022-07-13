package com.example.casestudymd4_shopxanh.controller;

import com.example.casestudymd4_shopxanh.model.Order;
import com.example.casestudymd4_shopxanh.service.OrderService;
import com.example.casestudymd4_shopxanh.service.ProductService;
import com.example.casestudymd4_shopxanh.service.impl.OrderServiceImpl;
import com.example.casestudymd4_shopxanh.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@CrossOrigin("*")
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;

    @Autowired
    ProductServiceImpl productService;


    @GetMapping
    public ResponseEntity<Iterable<Order>> findAllOrder() {
        return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Order> save(@RequestBody Order order) {
        LocalDateTime time = LocalDateTime.now();
        order.setCreatAt(time);
        orderService.save(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
