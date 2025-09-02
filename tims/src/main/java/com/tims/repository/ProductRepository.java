package com.tims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tims.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
