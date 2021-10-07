package com.example.safariwebstore008.services;

import com.example.safariwebstore008.models.ServiceRegion;

import java.util.Optional;

public interface Regionservice {
 ServiceRegion findServiceRegionByName(String name);
}
