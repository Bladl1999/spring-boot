package com.example.example.mapper;

import com.example.example.model.dto.ShipDto;
import com.example.example.model.entities.ShipEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring", uses = {PortMapper.class})
public interface ShipMapper {
    ShipMapper SHIP_MAPPER = Mappers.getMapper(ShipMapper.class);
    @Mappings({
            @Mapping(source = "port", target = "port"),
            @Mapping(source = "staff",target = "staff")
    })
    ShipEntity toEntity(ShipDto shipDTO);

    @Mappings({
            @Mapping(source = "port", target = "port"),
            @Mapping(source = "staff",target = "staff")
    })
    ShipDto toDto(ShipEntity shipEntity);

    List<ShipEntity> toEntityList(List<ShipDto> dtos);

    List<ShipDto> toDtoList(List<ShipEntity> entitys);

    Set<ShipEntity> toEntitySet(Set<ShipDto> dtos);

    Set<ShipDto> toDtoSet(Set<ShipEntity> entitys);
}
