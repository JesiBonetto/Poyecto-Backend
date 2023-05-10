
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.Redes;
import com.portfolio.proyecto.repository.IRedes;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRedes implements ISRedes{
    @Autowired
    IRedes iRedes;

    @Override
    public List<Redes> verRedes() {
        List<Redes> listaRedes = iRedes.findAll();
        return listaRedes;
    }

    @Override
    public void crearRed(Redes re) {
        iRedes.save(re);
    }

    @Override
    public void borrarRed(Long id) {
        iRedes.deleteById(id);
    }

    @Override
    public Redes buscarRed(Long id) {
        Redes red = iRedes.findById(id).orElse(null);
        return red;
    }

    public Redes findRedesById(Long redes_id) {
        return null;
    }
    
}
