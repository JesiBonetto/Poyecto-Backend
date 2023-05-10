
package com.portfolio.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String inicio;
    private String fin;
    private String descripcion;
    private String url;
    private String tecnologia;

    public Proyectos() {
    }

    public Proyectos(String nombre, String inicio, String fin, String descripcion, String url, String tecnologia) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.url = url;
        this.tecnologia = tecnologia;
    }

}
