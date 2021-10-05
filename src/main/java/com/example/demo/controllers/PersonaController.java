package com.example.demo.controllers;

import com.example.demo.services.PersonaService;

import java.util.List;
import com.example.demo.models.entity.Persona;
import org.springframework.validation.BindingResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController{

    @Autowired
    PersonaService personaService;



    
    @GetMapping("/list")
    private ResponseEntity<List<Persona>>GetPersonas(){

        return ResponseEntity.ok(personaService.findAll());

    }



@PostMapping("/crear")
    public ResponseEntity<Persona> crear(@RequestBody Persona persona){
    
            Persona p = personaService.save(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(p);
    }
    
}
