package com.tims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tims.model.users;

public interface UserRepository extends JpaRepository<users, Long> {}

