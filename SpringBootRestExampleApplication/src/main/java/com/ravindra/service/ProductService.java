package com.ravindra.service;

import com.ravindra.model.Product;
import com.ravindra.repository.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements ProductDetails{

    IProductService iProductService;
    public ProductService(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @Override
    public String createProduct(Product product) {
        iProductService.save(product);
        return "Successfully";
    }

    @Override
    public String updateProduct(Product product) {
        iProductService.save(product);
        return "Successfully";
    }

    @Override
    public String deleteProduct(Integer id) {

        iProductService.deleteById(id);
        return "Delete product details Successfully";
    }

    @Override
    public Product getProduct(Integer id) {
        return iProductService.findById(id).get();

    }

    @Override
    public List<Product> getAllProduct() {
        return iProductService.findAll();
    }
}
