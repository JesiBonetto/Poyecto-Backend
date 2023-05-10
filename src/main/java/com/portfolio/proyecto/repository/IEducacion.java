
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacion extends JpaRepository<Educacion,Long>{
    
    public Educacion findEducacionById (Long id);
    
}
