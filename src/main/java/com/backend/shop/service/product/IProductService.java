package com.backend.shop.service.product;

import com.backend.shop.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);

    Product getProductId(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getAllProduct();
    List<Product> getProductByCategory(String category);
    List<Product> getProductByCategoryAndBrand(String category,String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String category, String name);
    Long countProductByBrandAndName(String brand, String name);


}
