package com.example.demo.controllers;

import com.example.demo.services.EstadoService;
import com.example.demo.models.entity.Estado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    EstadoService estadoService;


    @GetMapping("/list")
    private ResponseEntity<List<Estado>>GetPersonas(){

        return ResponseEntity.ok(estadoService.findAll());

    }


    @GetMapping({"id"})
    private ResponseEntity<List<Estado>>getEstadosbyPais(@PathVariable("id")int id){

        return ResponseEntity.ok(estadoService.findAllbyPais(id));
    }

    

    @PostMapping("/crear")
    private ResponseEntity<Estado>CrearEstado(@RequestBody Estado estado){

        Estado e=estado;

        //System.out.println("ID DEL PAIS: "+ estado.getPais().getId());
         e = estadoService.save(estado);
        return ResponseEntity.status(HttpStatus.CREATED).body(e);      

    }



    
}
