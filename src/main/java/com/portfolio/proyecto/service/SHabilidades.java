
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Habilidades;
import com.portfolio.proyecto.repository.IHabilidades;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidades implements ISHabilidades{
    @Autowired
    IHabilidades iHabilidades;

    @Override
    public List<Habilidades> verHabilidades() {
        List<Habilidades> listaHabilidades = iHabilidades.findAll();
        return listaHabilidades;
    }

    @Override
    public void crearHabilidad(Habilidades hab) {
         iHabilidades.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        iHabilidades.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        Habilidades habi = iHabilidades.findById(id).orElse(null);
        return habi;
    }

    public Habilidades findHabilidadesById(Long habi_id) {

        return null;

    }
    
}
