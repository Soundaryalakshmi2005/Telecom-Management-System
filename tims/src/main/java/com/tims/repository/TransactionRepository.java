package com.tims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tims.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {}
