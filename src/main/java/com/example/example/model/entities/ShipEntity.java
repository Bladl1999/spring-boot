package com.example.example.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ships")
public class ShipEntity {
    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String country;

    @ManyToOne
    @JoinColumn(name = "port_id",referencedColumnName = "id", nullable = false)
    private PortEntity port;

    public ShipEntity() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipEntity that = (ShipEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(country, that.country) && Objects.equals(port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, port);
    }
}
