package com.example.safariwebstore008.repositories;

import com.example.safariwebstore008.models.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Long> {

}
