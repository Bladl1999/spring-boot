package com.example.example.service.impl;

import com.example.example.exeption.NotFoundVauleException;
import com.example.example.mapper.ShipMapper;
import com.example.example.model.dto.ShipDto;
import com.example.example.repository.ShipRepository;
import com.example.example.service.ShipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipServiceImpl implements ShipService {
    private final ShipRepository shipRepository;
    private final ShipMapper shipMapper;

    public ShipServiceImpl(ShipRepository shipRepository, ShipMapper shipMapper) {
        this.shipRepository = shipRepository;
        this.shipMapper = shipMapper;
    }

    @Override
    public ShipDto create(ShipDto ship) {
        shipRepository.save(shipMapper.toEntity(ship));
        return ship;
    }

    @Override
    public List<ShipDto> findAll() {
        return shipMapper.toDtoList(shipRepository.findAll());
    }

    @Override
    public ShipDto findById(long id) {
        return shipMapper.toDto(shipRepository.findById(id)
                .orElseThrow(()->new NotFoundVauleException("Can not found ship id = " + id));
    }

    @Override
    public ShipDto update(ShipDto ship) {
        shipRepository.findById(ship.getId())
                .orElseThrow(()->new NotFoundVauleException("Can not found ship id = " + ship.getId()));
        shipRepository.save(shipMapper.toEntity(ship));
        return shipMapper.toDto(
                shipRepository.findById(ship.getId())
                .orElseThrow(()->new NotFoundVauleException("Can not found ship id = " + ship.getId())));
    }

    @Override
    public ShipDto delete(long id) {
        ShipDto shipDTO = shipMapper.toDto(shipRepository.findById(id)
                .orElseThrow(()->new NotFoundVauleException("Can not found ship id = " + id)));
        shipRepository.deleteById(id);
        return shipDTO;
    }
}
