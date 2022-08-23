
package com.proyect.na.service;

import com.proyect.na.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    // muestra una lista de personas
    public List<Persona> verPersonas (); 
    
    // crea o guarda una nueva persona
    public void crearPersona (Persona per); 
    
    // elimina una persona por id
    public void eliminarPersona (Long id); 

    // busca una persona por id
    public Persona buscarPersona (Long id);
}
