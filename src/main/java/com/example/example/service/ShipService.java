package com.example.example.service;

import com.example.example.model.dto.ShipDTO;

import java.util.List;

public interface ShipService {
    ShipDTO create(ShipDTO ship);
    List<ShipDTO> findAll();
    ShipDTO findById(long id);
    ShipDTO update(ShipDTO ship);
    ShipDTO delete(long id);
}
