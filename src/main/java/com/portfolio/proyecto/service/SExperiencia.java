
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Experiencia;
import com.portfolio.proyecto.repository.IExperiencia;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia implements ISExperiencia {
    @Autowired
    IExperiencia iExperiencia;

    @Override
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias = iExperiencia.findAll();
        return listaExperiencias;
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        iExperiencia.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        iExperiencia.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        Experiencia exper = iExperiencia.findById(id).orElse(null);
        return exper;
    }

    public Experiencia findExperienciaById(Long expe_id) {

        return null;

    }
    
}
