
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Proyectos;
import java.util.List;


public interface ISProyectos {
     public List<Proyectos> verProyectos();
    public void crearProyecto(Proyectos pro);
    public void borrarProyecto(Long id);
    public Proyectos buscarProyecto(Long id);
}
