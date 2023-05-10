
package com.portfolio.proyecto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoPersona {
    private String nombre;
    private int edad;
    private String ciudad;
    private String sobre_mi;
    private String foto;
    private String baner;

    public DtoPersona() {
    }

    public DtoPersona(String nombre, int edad, String ciudad, String sobre_mi, String foto, String baner) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.sobre_mi = sobre_mi;
        this.foto = foto;
        this.baner = baner;
    }
    
    
}
