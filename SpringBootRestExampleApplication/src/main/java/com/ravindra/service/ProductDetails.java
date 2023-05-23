package com.ravindra.service;

import com.ravindra.model.Product;

import java.util.List;

public interface ProductDetails {
    public String createProduct(Product product);
    public String updateProduct(Product product);
    public String deleteProduct(Integer id);
    public Product getProduct(Integer id);

    public List<Product> getAllProduct();
}
