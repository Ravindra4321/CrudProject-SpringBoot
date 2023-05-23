package com.ravindra.repository;

import com.ravindra.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductService  extends JpaRepository<Product,Integer> {

}
