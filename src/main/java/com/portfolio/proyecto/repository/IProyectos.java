
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectos extends JpaRepository<Proyectos,Long> {
    public Proyectos findProyectosById (Long id);
    
}
