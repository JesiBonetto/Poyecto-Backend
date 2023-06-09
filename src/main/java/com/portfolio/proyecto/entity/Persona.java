
package com.portfolio.proyecto.entity;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private int edad;
    private String ciudad;
    @Column(columnDefinition = "TEXT")
    @NotNull
    private String sobre_mi;
    private String foto;
    private String baner;

    public Persona() {
    }

    public Persona(String nombre, int edad, String ciudad, String sobre_mi, String foto, String baner) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.sobre_mi = sobre_mi;
        this.foto = foto;
        this.baner = baner;
    }
   
    
}
