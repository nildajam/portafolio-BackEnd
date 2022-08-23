package com.proyect.na.controller;

import com.proyect.na.model.Persona;
import com.proyect.na.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/persona")
    public String agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada con exito";        
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        persoServ.eliminarPersona(id);
        return "La persona fue eliminada con exito";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido) {

        Persona perso = persoServ.buscarPersona(id);

        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);

        persoServ.crearPersona(perso);
        return perso;
    }
}