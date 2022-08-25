package com.project.na.controller;

import com.project.na.model.Persona;
import com.project.na.security.entity.Rol;
import com.project.na.security.enums.RolNombre;
import com.project.na.security.service.RolService;
import com.project.na.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "https://frontendna.web.app")

public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    @Autowired
    private RolService rolService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/persona")
    public String agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada con exito";
    }

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hola mundo";
    }

    @GetMapping("/roles")
    @ResponseBody
    public String addRoles() {
        rolService.save(new Rol(RolNombre.ROLE_USER));
        rolService.save(new Rol(RolNombre.ROLE_ADMIN));

        return "Listo";
    }

    @GetMapping("/ver/roles")
    @ResponseBody
    public List<Rol> viewRoles() {
        return rolService.verRoles();
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
    @PutMapping("/persona/editar/{id}")
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
