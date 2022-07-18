package com.example.example.service;

import com.example.example.model.dto.PortDto;

import java.util.List;

public interface PortService {
    PortDto create(PortDto port);

    List<PortDto> findAll();

    PortDto findById(long id);

    PortDto update(PortDto port);

    PortDto delete(long id);
}
