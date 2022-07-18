package com.example.example.repository;

import com.example.example.model.entities.PortEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortRepository extends JpaRepository<PortEntity, Long> {
}
