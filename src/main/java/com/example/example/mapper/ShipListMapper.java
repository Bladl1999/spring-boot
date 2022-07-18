package com.example.example.mapper;

import com.example.example.model.dto.ShipDTO;
import com.example.example.model.entities.ShipEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = ShipMapper.class)
public interface ShipListMapper {
    List<ShipEntity> toEntityList(List<ShipDTO> dtos);
    List<ShipDTO> toDTOList(List<ShipEntity> entitys);
}
