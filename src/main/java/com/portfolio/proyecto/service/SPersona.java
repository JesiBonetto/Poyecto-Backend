
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Persona;
import com.portfolio.proyecto.repository.IPersona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona implements ISPersona{
    @Autowired
    IPersona iPersona;

    @Override
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas = iPersona.findAll();
        return listaPersonas;
    }

    @Override
    public void crearPersona(Persona per) {
        iPersona.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        iPersona.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona perso = iPersona.findById(id).orElse(null);
        return perso;
    }

    public Persona findPersonaById(Long perso_id) {
        return null;
    }
      
}
