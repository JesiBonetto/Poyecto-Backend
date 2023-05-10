
package com.portfolio.proyecto.controller;

import com.portfolio.proyecto.entity.Experiencia;
import com.portfolio.proyecto.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
public class CExperiencia {
    @Autowired
    SExperiencia expeServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expeServ.verExperiencias();
    }
    
    @PostMapping("/new")
    public String agregarExperiencia(@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
        return "La experiencia fue eliminada";
    }
    
    @GetMapping("/id/{experiencia_id}")
    public Experiencia getExperienciaById (@PathVariable Long experiencia_id) {
        return expeServ.findExperienciaById(experiencia_id);
    }
    
    
}
