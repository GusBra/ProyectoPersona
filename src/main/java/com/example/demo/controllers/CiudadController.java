package com.example.demo.controllers;

import javax.persistence.EntityManager;
import java.util.List;

import com.example.demo.services.CiudadService;
import com.example.demo.models.entity.ciudad;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ciudad")
public class CiudadController  {

    @Autowired
    CiudadService ciudadService;


    @GetMapping("/list")
    private ResponseEntity<List<ciudad>>GetAllCiudades(){

    return ResponseEntity.ok(ciudadService.findAll());
    }


    @PostMapping("/crear")
    private ResponseEntity<ciudad>Crear(@RequestBody ciudad ciudad){

        ciudad C=ciudad;
        ciudadService.save(C);       
        
        return ResponseEntity.status(HttpStatus.CREATED).body(C);
    }

    





}
