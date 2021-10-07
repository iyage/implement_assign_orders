package com.example.safariwebstore008.POJO;


import com.example.safariwebstore008.enums.OrderAssigStatus;
import com.example.safariwebstore008.models.*;
import com.example.safariwebstore008.services.servicesImpl.AssignOrderServiceImp;
import com.example.safariwebstore008.services.servicesImpl.CustomerServiceImpl;
import com.example.safariwebstore008.services.servicesImpl.RegionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.plaf.synth.Region;


public class AssignOrderToDispatchRider {
    @Autowired
    CustomerServiceImpl customerService;
    @Autowired
    RegionServiceImpl regionService;
    @Autowired
    AssignOrderServiceImp assignOrderServiceImp;
    @Autowired
    public void  assignOrderToDispatchRider(CustomerOrder customerOrder){
   ShipingAddress shippingAddress = customerOrder.getShippingAddress();
    String regionName =  shippingAddress.getRegionName();
       ServiceRegion regionAssigned = regionService.findServiceRegionByName(regionName);
      Users dispatchRider = regionAssigned.getUserModel();
      AssignOrders assignOrders = new AssignOrders();
      assignOrders.setOrders(customerOrder);
      assignOrders.setUser(dispatchRider);
      customerOrder.setStatus(OrderAssigStatus.ASSIGNED);
      customerService.saveCustomerOrder(customerOrder);
      assignOrderServiceImp.saveAssignOrders(assignOrders);
    //logic to send notification to dispatch rider would be here
    }
}
