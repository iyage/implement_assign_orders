package com.example.safariwebstore008.services.servicesImpl;

import com.example.safariwebstore008.models.CustomerOrder;
import com.example.safariwebstore008.repositories.CustomerOrderRepository;
import com.example.safariwebstore008.services.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerOrderService {
    @Autowired
    CustomerOrderRepository customerOrderRepository;
    @Override
    public CustomerOrder saveCustomerOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder) ;
    }
}
