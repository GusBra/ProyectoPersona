package com.example.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad")
public class ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String poblacion;
    

    @ManyToOne
    @JoinColumn(name = "id_pais")
    Pais pais;


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPoblacion() {
        return poblacion;
    }


    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }


    public Pais getPais() {
        return pais;
    }


    public void setPais(Pais pais) {
        this.pais = pais;
    }



    
}