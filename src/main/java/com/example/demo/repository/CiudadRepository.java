package com.example.demo.repository;

import com.example.demo.models.entity.ciudad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<ciudad,Long>{
    
    
}
