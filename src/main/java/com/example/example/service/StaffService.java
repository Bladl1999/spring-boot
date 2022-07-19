package com.example.example.service;

import com.example.example.model.dto.StaffDto;

import java.util.List;

public interface StaffService {
    StaffDto create(StaffDto staff);

    List<StaffDto> findAll();

    StaffDto findById(long id);

    StaffDto update(StaffDto staff);

    StaffDto delete(long id);
}
