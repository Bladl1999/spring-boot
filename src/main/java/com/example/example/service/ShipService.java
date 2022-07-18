package com.example.example.service;

import com.example.example.model.dto.ShipDto;

import java.util.List;

public interface ShipService {
    ShipDto create(ShipDto ship);

    List<ShipDto> findAll();

    ShipDto findById(long id);

    ShipDto update(ShipDto ship);

    ShipDto delete(long id);
}
