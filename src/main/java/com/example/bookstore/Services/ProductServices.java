package com.example.bookstore.Services;

import com.example.bookstore.Entity.Product;
import com.example.bookstore.Pojo.ProductPojo;

import java.io.IOException;
import java.util.List;

public interface ProductServices {
    ProductPojo save(ProductPojo productPojo) throws IOException;
    List<Product> findAll();
    List<Product> getThreeRandomData();

    Product findById(Integer id);
    void deleteById(Integer id);
}

