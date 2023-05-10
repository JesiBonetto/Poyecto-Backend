
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRedes extends JpaRepository<Redes,Long>{
    public Redes findRedesById (Long id);
    
}
