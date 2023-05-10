
package com.portfolio.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String academia;

    public Educacion() {
    }

    public Educacion(String titulo, String academia) {
        this.titulo = titulo;
        this.academia = academia;
    }
}
