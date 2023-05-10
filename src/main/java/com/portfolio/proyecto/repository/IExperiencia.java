
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperiencia extends JpaRepository<Experiencia,Long>{
    public Experiencia findExperienciaById (Long id);
    
}
