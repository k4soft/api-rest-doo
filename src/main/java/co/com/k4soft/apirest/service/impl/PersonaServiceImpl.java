package co.com.k4soft.apirest.service.impl;

import co.com.k4soft.apirest.entity.Persona;
import co.com.k4soft.apirest.repository.PersonaRepository;
import co.com.k4soft.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public void insert(Persona persona) {
        if(findById(persona.getId()) == null){
            personaRepository.save(persona);
        }
    }

    @Override
    public void update(Persona persona) {
        if(findById(persona.getId()) != null) {
            personaRepository.save(persona);
        }
    }

    private Persona findById(Long id){
        id = getaLong(id);
        return personaRepository.findById(id).orElse(null);
    }

    private Long getaLong(Long id) {
        id = id==null?0L:id;
        return id;
    }

    @Override
    public void delete(Long id) {
        personaRepository.deleteById(id);
    }
}
