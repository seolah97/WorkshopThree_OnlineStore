package com.sb;

public class Products {
// Initialize product properties:
    private String productId;
    private String productName;
    private float price;

// Constructors
    public Products(String productId, String productName, float price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

// Create getters and setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

// (Optional) Create overridden toString method
    @Override
    public String toString() {
        return "ID: " + productId + ",  Name: " + productName + ",  Price:$" + price;
    }
}
