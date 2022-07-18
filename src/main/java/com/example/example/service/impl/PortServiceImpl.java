package com.example.example.service.impl;

import com.example.example.mapper.PortListMapper;
import com.example.example.mapper.PortMapper;
import com.example.example.model.dto.PortDTO;
import com.example.example.repository.PortRepository;
import com.example.example.service.PortService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortServiceImpl implements PortService {

    private final PortRepository portRepository;
    private final PortMapper portMapper;
    private final PortListMapper portListMapper;



    public PortServiceImpl(PortRepository portRepository, PortMapper portMapper, PortListMapper portListMapper) {
        this.portRepository = portRepository;
        this.portMapper = portMapper;
        this.portListMapper = portListMapper;
    }

    @Override
    public PortDTO create(PortDTO port) {
        portRepository.save(portMapper.toEntity(port));
        return port;
    }

    @Override
    public List<PortDTO> findAll() {
        return portListMapper.toDTOList(portRepository.findAll());
    }

    @Override
    public PortDTO findById(long id) {
        return portMapper.toDTO(portRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new));
    }

    @Override
    public PortDTO update(PortDTO port) {
        portRepository.findById(port.getId())
                .orElseThrow(IllegalArgumentException::new);
        portRepository.save(portMapper.toEntity(port));
        return port;
    }

    @Override
    public PortDTO delete(long id) {
        PortDTO portDTO = portMapper.toDTO(portRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new));
        portRepository.deleteById(id);
        return portDTO;
    }
}
