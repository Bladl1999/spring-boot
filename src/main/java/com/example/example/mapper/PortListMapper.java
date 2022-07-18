package com.example.example.mapper;

import com.example.example.model.dto.PortDTO;
import com.example.example.model.entities.PortEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = PortMapper.class)
public interface PortListMapper {
    List<PortEntity> toEntityList(List<PortDTO> dtos);
    List<PortDTO> toDTOList(List<PortEntity> entitys);
}
