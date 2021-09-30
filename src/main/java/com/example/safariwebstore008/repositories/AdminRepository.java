package com.example.safariwebstore008.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository  extends JpaRepository<Admin,Long> {
    Admin findAdminByEmail(String email);
}