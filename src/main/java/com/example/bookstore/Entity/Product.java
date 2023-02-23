package com.example.bookstore.Entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    @SequenceGenerator(name = "jps_user_seq_gen", sequenceName = "jps_user_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "jps_user_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "productname")
    private String productname;

    @Column(name = "price")
    private String price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private String quantity;


    @Column(name = "brand")
    private String brand;

    @Column(name = "category")
    private String catrgory;
    @Column(name = "color")
    private String color;

    @Column(name = "image")
    private String image;

    @Transient
    private String imageBase64;


}
