package com.example.demo.controllers;
import com.example.demo.services.PaisService;
import com.example.demo.models.entity.Pais;
import com.example.demo.models.entity.Persona;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    PaisService paisService;


    @GetMapping("/list")
    private ResponseEntity<List<Pais>> getAllPaises(){

        return ResponseEntity.ok(paisService.findAll());
    }


    @PostMapping("/crear")
    public ResponseEntity<Pais> crear(@RequestBody Pais pais){
    
             Pais p = paisService.save(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(p);
    }
    




    
}
