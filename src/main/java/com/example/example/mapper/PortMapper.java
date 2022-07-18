package com.example.example.mapper;

import com.example.example.model.dto.PortDto;
import com.example.example.model.entities.PortEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PortMapper {
    PortEntity toEntity(PortDto portDTO);

    PortDto toDto(PortEntity portEntity);

    List<PortEntity> toEntityList(List<PortDto> dtos);

    List<PortDto> toDtoList(List<PortEntity> entitys);
}