
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Proyectos;
import com.portfolio.proyecto.repository.IProyectos;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos implements ISProyectos{
    @Autowired
    IProyectos iProyectos;

    @Override
    public List<Proyectos> verProyectos() {
         List<Proyectos> listaProyectos = iProyectos.findAll();
        return listaProyectos;
    }

    @Override
    public void crearProyecto(Proyectos pro) {
        iProyectos.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        iProyectos.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        Proyectos proy = iProyectos.findById(id).orElse(null);
        return proy;
    }

    public Proyectos findProyectosById(Long proye_id) {
        return null;
    }
    
    
}
