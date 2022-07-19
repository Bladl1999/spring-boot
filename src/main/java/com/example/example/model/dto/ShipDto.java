package com.example.example.model.dto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ShipDto {
    private Long id;

    private String name;

    private String country;

    private PortDto port;

    private Set<StaffDto> staff;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public PortDto getPort() {
        return port;
    }

    public void setPort(PortDto port) {
        this.port = port;
    }

    public Set<StaffDto> getStaff() {
        return staff;
    }

    public void setStaff(Set<StaffDto> staff) {
        this.staff = staff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipDto shipDto = (ShipDto) o;
        return Objects.equals(id, shipDto.id) && Objects.equals(name, shipDto.name) && Objects.equals(country, shipDto.country) && Objects.equals(port, shipDto.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, port);
    }
}
