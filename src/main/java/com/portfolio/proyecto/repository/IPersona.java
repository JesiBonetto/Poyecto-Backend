
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.Persona;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona,Long>{

    public Optional<Persona> findByNombre(String nombre);
    public Persona findPersonaById (Long id);
    
}
