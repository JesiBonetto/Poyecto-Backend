
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Experiencia;
import java.util.List;


public interface ISExperiencia {
     public List<Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia expe);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
}
