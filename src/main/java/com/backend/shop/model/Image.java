package com.backend.shop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
@Getter
@Setter
@AllArgsConstructor

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //uses the database’s native identity mechanism to auto-increment primary keys.
    private long id;

    private String fielname;
    private String filetype;

    @Lob
    private Blob image;
    private String downloadURL;

    @ManyToOne
    @JoinColumn(name="product_id")
    //Will be joined to column of name "product_id" in product table
    private Product product;
}

//Image file incomplete. Need to create reference and relationship