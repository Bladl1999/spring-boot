package com.example.example.mapper;

import com.example.example.model.dto.ShipDto;
import com.example.example.model.entities.ShipEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShipMapper {
    ShipEntity toEntity(ShipDto shipDTO);

    ShipDto toDto(ShipEntity shipEntity);

    List<ShipEntity> toEntityList(List<ShipDto> dtos);

    List<ShipDto> toDtoList(List<ShipEntity> entitys);
}
