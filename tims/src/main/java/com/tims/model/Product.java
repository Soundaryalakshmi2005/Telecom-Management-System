package com.tims.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double stock;   // match DB (decimal)

    @Column(nullable = false)
    private int reorderPoint;  // match DB column

    public Product() {}

    public Product(String name, String category, double stock, int reorderPoint) {
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.reorderPoint = reorderPoint;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getStock() { return stock; }
    public void setStock(double stock) { this.stock = stock; }

    public int getReorderPoint() { return reorderPoint; }
    public void setReorderPoint(int reorderPoint) { this.reorderPoint = reorderPoint; }
}
