package com.backend.shop.service.product;

import com.backend.shop.model.Product;

import java.util.List;

public class ProductService implements IProductService {
    private ProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductId(Long id) {
        return productRepository.findById(id).orElse(()-> new ProductNotFoundException("ProductNotFound!"));
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProduct() {
        return List.of();
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductByBrandAndName(String category, String name) {
        return List.of();
    }

    @Override
    public Long countProductByBrandAndName(String brand, String name) {
        return 0L;
    }
}

//
