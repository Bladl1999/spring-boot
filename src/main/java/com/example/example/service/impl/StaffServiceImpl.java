package com.example.example.service.impl;

import com.example.example.exeption.NotFoundValueException;
import com.example.example.mapper.StaffMapper;
import com.example.example.model.dto.StaffDto;
import com.example.example.repository.StaffRepository;
import com.example.example.service.StaffService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;
    private final StaffMapper staffMapper;

    public StaffServiceImpl(StaffRepository staffRepository, StaffMapper staffMapper) {
        this.staffRepository = staffRepository;
        this.staffMapper = staffMapper;
    }

    @Override
    public StaffDto create(StaffDto staff) {
        staffRepository.save(staffMapper.toEntity(staff));
        return staff;
    }

    @Override
    public List<StaffDto> findAll() {
        return staffMapper.toDtoList(staffRepository.findAll());
    }

    @Override
    public StaffDto findById(long id) {
        return staffMapper.toDto(staffRepository.findById(id)
                .orElseThrow(() -> new NotFoundValueException(StaffDto.class, "id", id)));
    }

    @Override
    public StaffDto update(StaffDto staff) {
        Long id = staff.getId();
        staffMapper.toDto(staffRepository.findById(id)
                .orElseThrow(() -> new NotFoundValueException(StaffDto.class, "id", id)));
        return staffMapper.toDto(staffRepository
                .save(staffMapper.toEntity(staff)));
    }

    @Override
    public StaffDto delete(long id) {
        StaffDto staffDto = staffMapper.toDto(staffRepository.findById(id)
                .orElseThrow(() -> new NotFoundValueException(StaffDto.class, "id", id)));
        staffRepository.deleteById(id);
        return staffDto;
    }
}
