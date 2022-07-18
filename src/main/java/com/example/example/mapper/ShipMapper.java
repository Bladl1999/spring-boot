package com.example.example.mapper;

import com.example.example.model.dto.ShipDTO;
import com.example.example.model.entities.ShipEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShipMapper {
    public ShipEntity toEntity(ShipDTO shipDTO);
    public ShipDTO toDTO(ShipEntity shipEntity);
}
