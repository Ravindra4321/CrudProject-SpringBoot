package com.ravindra.controller;

import com.ravindra.model.Product;
import com.ravindra.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{id}")
    public Product getProductDetails(@PathVariable("id") Integer id){

        return  productService.getProduct(id);
                //Product("Asus","Au789",234589,5);
    }
    @GetMapping()
    public List<Product> getAllProductDetails(){

        return  productService.getAllProduct();
        //Product("Asus","Au789",234589,5);
    }
    @PostMapping
    public String createProductDetails(@RequestBody Product product) {
        productService.createProduct(product);
        return "product details create successfully";
    }
    @PutMapping
    public String updateProductDetails(@RequestBody Product product) {
        productService.updateProduct(product);
        return "product details update successfully";
    }
    @DeleteMapping("{id}")
    public String deleteProductDetails(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
        return "product details delete successfully";
    }
}
