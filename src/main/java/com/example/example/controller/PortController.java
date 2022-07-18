package com.example.example.controller;

import com.example.example.model.dto.PortDto;
import com.example.example.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/port")
public class PortController {
    private final PortService portService;

    @Autowired
    public PortController(PortService portService) {
        this.portService = portService;
    }

    @PostMapping
    public ResponseEntity<PortDto> create(@RequestBody PortDto port) {
        return ResponseEntity.ok(portService.create(port));
    }

    @GetMapping
    public ResponseEntity<List<PortDto>> findAll() {
        return ResponseEntity.ok(portService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PortDto> findById(@PathVariable long id) {
        return ResponseEntity.ok(portService.findById(id));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PortDto> update(@RequestBody PortDto ship) {
        return ResponseEntity.ok(portService.update(ship));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PortDto> delete(@PathVariable long id) {
        return ResponseEntity.ok(portService.delete(id));
    }
}
