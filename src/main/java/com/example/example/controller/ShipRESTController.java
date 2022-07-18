package com.example.example.controller;

import com.example.example.model.dto.ShipDTO;
import com.example.example.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ships")
public class ShipRESTController {

    private final ShipService shipService;

    @Autowired
    public ShipRESTController(ShipService shipService) {
        this.shipService = shipService;
    }

    @PostMapping
    public ShipDTO create(@RequestBody ShipDTO ship) {
        return shipService.create(ship);
    }

    @GetMapping
    public ResponseEntity<List<ShipDTO>> findAll() {
        return new ResponseEntity<>(shipService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ShipDTO findById(@PathVariable(name = "id") long id){
        return shipService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public ShipDTO update(@RequestBody ShipDTO ship)  {
        return shipService.update(ship);
    }

    @DeleteMapping(value = "/{id}")
    public ShipDTO delete(@PathVariable(name = "id") long id){
        return shipService.delete(id);
    }




    /*
    @Autowired
    private ShipService shipService;

    @GetMapping("/add")
    public String showNewShipForm(Model model) {
        Ship ship = new
        // save Course to database
        courseService.saveCourse(course);
        return "redirect:/";
         Ship();
        model.addAttribute("ship",ship);
        return  "new_ship";
    }

    @PostMapping("/save")
    public String saveShip(@ModelAttribute("ship") Ship ship) {
        shipService.saveShip(ship);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {

        Ship ship = shipService.getShipById(id);
        model.addAttribute("ship",ship);

        model.addAttribute("course", course);
        return "update_course";

        return "update_ship";
    }

    @GetMapping("/delete/{id}")
    public String deleteCourse(@PathVariable (value = "id") long id) {
        this.shipService.deleteShipById(id);
        return "redirect:/";
    }
     */

}


