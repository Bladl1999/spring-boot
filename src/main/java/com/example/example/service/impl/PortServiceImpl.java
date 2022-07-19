package com.example.example.service.impl;

import com.example.example.exeption.NotFoundVauleException;
import com.example.example.mapper.PortMapper;
import com.example.example.model.dto.PortDto;
import com.example.example.repository.PortRepository;
import com.example.example.service.PortService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortServiceImpl implements PortService {

    private final PortRepository portRepository;
    private final PortMapper portMapper;

    public PortServiceImpl(PortRepository portRepository, PortMapper portMapper) {
        this.portRepository = portRepository;
        this.portMapper = portMapper;
    }

    @Override
    public PortDto create(PortDto port) {
        portRepository.save(portMapper.toEntity(port));
        return port;
    }

    @Override
    public List<PortDto> findAll() {
        return portMapper.toDtoList(portRepository.findAll());
    }

    @Override
    public PortDto findById(long id) {
        return portMapper.toDto(portRepository.findById(id)
                .orElseThrow(()->  new NotFoundVauleException(PortDto.class, "id", id)));
    }

    @Override
    public PortDto update(PortDto port) {
        Long id = port.getId();
        portRepository.findById(id)
                .orElseThrow(() -> new NotFoundVauleException(PortDto.class, "id", id));
        portRepository.save(portMapper.toEntity(port));
        return portMapper.toDto(
                portRepository.findById(id)
                .orElseThrow(() -> new NotFoundVauleException(PortDto.class, "id", id)));
    }

    @Override
    public PortDto delete(long id) {
        PortDto portDto = portMapper.toDto(portRepository.findById(id)
                .orElseThrow(() -> new NotFoundVauleException(PortDto.class, "id", id)));
        portRepository.deleteById(id);
        return portDto;
    }
}
