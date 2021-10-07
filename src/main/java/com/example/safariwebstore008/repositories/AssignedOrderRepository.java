package com.example.safariwebstore008.repositories;

import com.example.safariwebstore008.models.AssignOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignedOrderRepository extends JpaRepository<AssignOrders,Long> {

}
