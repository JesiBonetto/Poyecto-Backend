
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IHabilidades extends JpaRepository<Habilidades,Long>{
    public Habilidades findHabilidadesById (Long id);
    
}
