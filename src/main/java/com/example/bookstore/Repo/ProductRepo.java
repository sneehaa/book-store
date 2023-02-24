package com.example.bookstore.Repo;


import com.example.bookstore.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT * FROM product ORDER BY RANDOM() LIMIT 3", nativeQuery = true)
    List<Product> getThreeRandomData();
    Optional<Product> findProductByProductname(String productname);
}
