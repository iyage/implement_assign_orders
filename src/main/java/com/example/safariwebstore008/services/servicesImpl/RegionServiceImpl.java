package com.example.safariwebstore008.services.servicesImpl;

import com.example.safariwebstore008.models.ServiceRegion;
import com.example.safariwebstore008.repositories.RegionRepository;
import com.example.safariwebstore008.services.Regionservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RegionServiceImpl implements Regionservice {
    @Autowired
    RegionRepository regionRepository;
    @Override
    public ServiceRegion findServiceRegionByName(String name) {
        return regionRepository.findServiceRegionByName(name);
    }
}
