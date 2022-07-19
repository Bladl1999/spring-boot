package com.example.example.repository;

import com.example.example.model.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffEntity, Long> {
}
