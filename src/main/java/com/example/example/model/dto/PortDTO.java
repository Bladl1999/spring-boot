package com.example.example.model.dto;

import java.util.Objects;


public class PortDTO {

    private long id;

    private String name;

    private String country;

//    private Set<ShipEntity> ships = new HashSet<>();


    public PortDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public Set<ShipEntity> getShips() {
//        return ships;
//    }
//
//    public void setShips(Set<ShipEntity> ships) {
//        this.ships = ships;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortDTO portDTO = (PortDTO) o;
        return id == portDTO.id && Objects.equals(name, portDTO.name) && Objects.equals(country, portDTO.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }
}
