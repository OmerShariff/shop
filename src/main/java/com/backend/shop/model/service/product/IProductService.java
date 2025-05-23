package com.backend.shop.model.service.product;

import com.backend.shop.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductId(Long id);

}
