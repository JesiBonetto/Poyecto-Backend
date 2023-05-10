
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Educacion;
import java.util.List;


public interface ISEducacion {
     public List<Educacion> verEducaciones();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
}
