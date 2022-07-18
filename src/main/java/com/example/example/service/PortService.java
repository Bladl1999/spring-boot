package com.example.example.service;

import com.example.example.model.dto.PortDTO;

import java.util.List;

public interface PortService {
    PortDTO create(PortDTO port);
    List<PortDTO> findAll();
    PortDTO findById(long id);
    PortDTO update(PortDTO port);
    PortDTO delete(long id);
}
