
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Persona;
import java.util.List;


public interface ISPersona {
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
