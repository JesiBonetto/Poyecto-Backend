
package com.portfolio.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String imagen; 
    private String url;

    public Redes() {
    }

    public Redes(String nombre, String imagen, String url) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.url = url;
    }

    

   
}
