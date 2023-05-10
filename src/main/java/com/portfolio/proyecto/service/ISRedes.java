
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Redes;
import java.util.List;


public interface ISRedes {
     public List<Redes> verRedes();
    public void crearRed(Redes re);
    public void borrarRed(Long id);
    public Redes buscarRed(Long id);
}
