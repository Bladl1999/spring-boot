package com.example.example.mapper;

import com.example.example.model.dto.PortDTO;
import com.example.example.model.entities.PortEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PortMapper {
    public PortEntity toEntity(PortDTO portDTO);
    public PortDTO toDTO(PortEntity portEntity);
}
