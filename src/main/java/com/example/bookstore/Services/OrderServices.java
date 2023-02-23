package com.example.bookstore.Services;

import com.example.bookstore.Entity.Order;
import com.example.bookstore.Pojo.OrderPojo;

import java.util.List;

public interface OrderServices {
    OrderPojo save(OrderPojo orderPojo);
    List<Order> findOrderById(Integer id);

    List<Order> findAll();

    Order findById(Integer id);
    void deleteById(Integer id);
}
