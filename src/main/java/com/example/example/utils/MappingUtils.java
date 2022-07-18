package com.example.example.utils;

import com.example.example.model.dto.ShipDTO;
import com.example.example.model.entities.ShipEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MappingUtils {

    public ShipDTO mapToShipDto(ShipEntity entity) {
        ShipDTO dto = new ShipDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCountry(entity.getCountry());
        return dto;
    }

    public List<ShipDTO> mapToShipDto(List<ShipEntity> entity) {
        List<ShipDTO> shipDtoList = new ArrayList<>();
        for(ShipEntity shipEntity: entity)
            shipDtoList .add(mapToShipDto(shipEntity));
        return shipDtoList;
    }

    public ShipEntity mapToShipEntity(ShipDTO dto) {
        ShipEntity entity = new ShipEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCountry(dto.getCountry());
        return entity;
    }

}
