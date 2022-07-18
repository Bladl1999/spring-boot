package com.example.example.service.impl;

import com.example.example.mapper.ShipListMapper;
import com.example.example.mapper.ShipMapper;
import com.example.example.model.dto.ShipDTO;
import com.example.example.repository.ShipRepository;
import com.example.example.service.ShipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipServiceImpl implements ShipService {
    private final ShipRepository shipRepository;
    private final ShipMapper shipMapper;
    private final ShipListMapper shipListMapper;


    public ShipServiceImpl(ShipRepository shipRepository, ShipMapper shipMapper, ShipListMapper shipListMapper) {
        this.shipRepository = shipRepository;
        this.shipMapper = shipMapper;
        this.shipListMapper = shipListMapper;
    }

    @Override
    public ShipDTO create(ShipDTO ship) {
        shipRepository.save(shipMapper.toEntity(ship));
        return ship;
    }

    @Override
    public List<ShipDTO> findAll() {
        return shipListMapper.toDTOList(shipRepository.findAll());
    }

    @Override
    public ShipDTO findById(long id)  {
        return shipMapper.toDTO(shipRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new));
    }

    @Override
    public ShipDTO update(ShipDTO ship)  {
            shipRepository.findById(ship.getId())
                    .orElseThrow(IllegalArgumentException::new);
            shipRepository.save(shipMapper.toEntity(ship));
            return ship;
    }

    @Override
    public ShipDTO delete(long id)  {
        ShipDTO shipDTO = shipMapper.toDTO(shipRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new));
        shipRepository.deleteById(id);
        return shipDTO;
    }
}
