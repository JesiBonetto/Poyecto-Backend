
package com.portfolio.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    
    private String inicio;
    private String fin;
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    public Experiencia() {
    }

    public Experiencia(String empresa, String inicio, String fin, String descripcion) {
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;    
    }
    
}
