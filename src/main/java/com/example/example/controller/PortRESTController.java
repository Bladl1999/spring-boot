package com.example.example.controller;

import com.example.example.model.dto.PortDTO;
import com.example.example.model.dto.ShipDTO;
import com.example.example.service.PortService;
import com.example.example.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ports")
public class PortRESTController {
    private final PortService portService;

    @Autowired
    public PortRESTController(PortService portService) {
        this.portService = portService;
    }

    @PostMapping
    public PortDTO create(@RequestBody PortDTO port) {
        return portService.create(port);
    }

    @GetMapping
    public ResponseEntity<List<PortDTO>> findAll() {
        return new ResponseEntity<>(portService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public PortDTO findById(@PathVariable(name = "id") long id){
        return portService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public PortDTO update(@RequestBody PortDTO ship)  {
        return portService.update(ship);
    }

    @DeleteMapping(value = "/{id}")
    public PortDTO delete(@PathVariable(name = "id") long id){
        return portService.delete(id);
    }


}
