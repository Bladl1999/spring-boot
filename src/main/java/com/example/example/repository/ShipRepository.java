package com.example.example.repository;

import com.example.example.model.entities.ShipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<ShipEntity, Long> {

}
