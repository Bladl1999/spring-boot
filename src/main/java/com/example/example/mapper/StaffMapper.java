package com.example.example.mapper;

import com.example.example.model.dto.StaffDto;
import com.example.example.model.entities.StaffEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = ShipMapper.class)
public interface StaffMapper {


    @Mapping(source = "ships", target = "ships")
    StaffEntity toEntity(StaffDto staffDto);

    @Mapping(source = "ships", target = "ships")
    StaffDto toDto(StaffEntity staffEntity);

    List<StaffEntity> toEntityList(List<StaffDto> dtos);

    List<StaffDto> toDtoList(List<StaffEntity> entitys);


}

