package com.example.bookstore;


import com.example.bookstore.Entity.Product;
import com.example.bookstore.Repo.ProductRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;
@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductRepoTest {
    @Autowired
    private ProductRepo productRepo;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveProductTest() {
        Product product = Product.builder()
                .productname("book")
                .price("700")
                .description("hello")
                .quantity("10")
                .image("xyz")
                .build();

        productRepo.save(product);

        Assertions.assertThat(product.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
    public void getProductTest() {
        Product product = productRepo.findById(1).get();
        Assertions.assertThat(product.getId()).isEqualTo(1);
    }

    @Test
    @Order(3)
    public void getListOfProductTest() {
        List<Product> Pets = productRepo.findAll();
        Assertions.assertThat(Pets.size()).isGreaterThan(889);
    }

    @Test
    @Order(4)
    @Rollback(value = false)
    public void updateProductTest() {
        Product product = productRepo.findById(1).get();
        product.setProductname("book");
        Product productUpdated = productRepo.save(product);
        Assertions.assertThat(productUpdated.getProductname()).isEqualTo("book");
    }

    @Test
    @Order(5)
    @Rollback(value = false)
    public void deleteProductTest() {
        Product product = productRepo.findById(1).get();
        productRepo.delete(product);
        Product product1 = null;
        Optional<Product> optionalProduct = productRepo.findProductByProductname("book");
        if (optionalProduct.isPresent()) {
            product1 = optionalProduct.get();
        }
        Assertions.assertThat(product1).isNull();
    }
}