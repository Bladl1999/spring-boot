package com.example.example.mapper;

import com.example.example.model.dto.StaffDto;
import com.example.example.model.entities.StaffEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring", uses = ShipMapper.class)
public interface StaffMapper {
    ShipMapper STAFF_MAPPER = Mappers.getMapper(ShipMapper.class);

    @Mapping(source = "ships",target = "ships")
    StaffEntity toEntity(StaffDto staffDto);

    @Mapping(source = "ships",target = "ships")
    StaffDto toDto(StaffEntity staffEntity);

    List<StaffEntity> toEntityList(List<StaffDto> dtos);

    List<StaffDto> toDtoList(List<StaffEntity> entitys);

    Set<StaffDto> toDtoSet(Set<StaffEntity> entitys);

    Set<StaffEntity> toEntitySet(Set<StaffDto> entitys);
}

