package com.example.safariwebstore008.repositories;

import com.example.safariwebstore008.models.ServiceRegion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<ServiceRegion,Long> {
    ServiceRegion findServiceRegionByName(String name);
}
