package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.entity.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PersonaRepository extends JpaRepository<Persona,Long>{



 //SQL Native commands//

 /*

 @Query(value= "SELECT * FROM Persona WHERE Persona.id_pais=2 ", nativeQuery = true)
List<Persona> findAll2();

*/



//JPQL commands//

@Query(value= "SELECT p FROM Persona p")
List<Persona> findAll2();





}
