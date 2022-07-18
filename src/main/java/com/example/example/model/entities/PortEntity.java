package com.example.example.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ports")
public class PortEntity {
    @Id
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String country;

//    @Column
//    private Set<ShipEntity> ships = new HashSet<>();

    public PortEntity() {
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
        PortEntity that = (PortEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }
}
