package co.com.k4soft.apirest.controller;


import co.com.k4soft.apirest.entity.Persona;
import co.com.k4soft.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @PostMapping("/persona")
    public void insert(@RequestBody Persona persona){
        personaService.insert(persona);
    }

    @PutMapping("/{id}/persona")
    public void update(@RequestBody Persona persona, @PathVariable(required = true) Long id){
        personaService.update(persona);
    }
    @DeleteMapping("/{id}/persona")
    public void deleter(@PathVariable(required = true) Long id){
        personaService.delete(id);
    }

}
