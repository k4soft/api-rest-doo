package co.com.k4soft.apirest.service;

import co.com.k4soft.apirest.entity.Persona;

import java.util.List;

public interface PersonaService {

   List<Persona> findAll();

   void insert(Persona persona);

   void update(Persona persona);

   void delete(Long id);

}

