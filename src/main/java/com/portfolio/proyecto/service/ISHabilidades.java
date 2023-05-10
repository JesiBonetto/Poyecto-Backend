
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Habilidades;
import java.util.List;


public interface ISHabilidades {
     public List<Habilidades> verHabilidades();
    public void crearHabilidad(Habilidades hab);
    public void borrarHabilidad(Long id);
    public Habilidades buscarHabilidad(Long id);
}
