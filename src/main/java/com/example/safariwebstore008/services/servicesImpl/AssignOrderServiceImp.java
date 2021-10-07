package com.example.safariwebstore008.services.servicesImpl;

import com.example.safariwebstore008.models.AssignOrders;
import com.example.safariwebstore008.repositories.AssignedOrderRepository;
import com.example.safariwebstore008.services.AssignOrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class AssignOrderServiceImp implements AssignOrderService {
    @Autowired
    AssignedOrderRepository assignedOrderRepository;
    @Override
    public AssignOrders saveAssignOrders(AssignOrders assignOrders) {
        return assignedOrderRepository.save(assignOrders) ;
    }
}
