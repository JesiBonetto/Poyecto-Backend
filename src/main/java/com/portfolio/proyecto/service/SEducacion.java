
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Educacion;
import com.portfolio.proyecto.repository.IEducacion;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion implements ISEducacion{
    @Autowired
    IEducacion iEducacion; 

    @Override
    public List<Educacion> verEducaciones() {
        List<Educacion> listaEducaciones = iEducacion.findAll();
        return listaEducaciones;
    }

    @Override
    public void crearEducacion(Educacion edu) {
        iEducacion.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        iEducacion.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        Educacion educa = iEducacion.findById(id).orElse(null);
        return educa;
    }

    public Educacion findEducacionById(Long educacion_id) {
        return null;
    }
}
