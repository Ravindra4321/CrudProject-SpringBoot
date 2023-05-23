package com.ravindra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_info")
public class Product {
    @Id
    private Integer id;
    private String pName;
    private String batchNo;
    private double price;
    private int noOfProduct;

    public Product(Integer id, String pName, String batchNo, double price, int noOfProduct) {
        this.id = id;
        this.pName = pName;
        this.batchNo = batchNo;
        this.price = price;
        this.noOfProduct = noOfProduct;
    }

    public Product(String pName, String batchNo, double price, int noOfProduct) {
        this.pName = pName;
        this.batchNo = batchNo;
        this.price = price;
        this.noOfProduct = noOfProduct;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfProduct() {
        return noOfProduct;
    }

    public void setNoOfProduct(Integer noOfProduct) {
        this.noOfProduct = noOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", price=" + price +
                ", noOfProduct=" + noOfProduct +
                '}';
    }
}
