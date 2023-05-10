
package com.portfolio.proyecto.controller;

import com.portfolio.proyecto.entity.Habilidades;
import com.portfolio.proyecto.service.SHabilidades;
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
@RequestMapping("/habilidades")
public class CHabilidades {
    @Autowired
    SHabilidades habiServ;
    
     @GetMapping("/ver")
    @ResponseBody
    public List<Habilidades> verHabilidades() {
        return habiServ.verHabilidades();
    }
    
    @PostMapping("/new")
    public String agregarHabilidad(@RequestBody Habilidades pers) {
        habiServ.crearHabilidad(pers);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarHabilidad(@PathVariable Long id) {
        habiServ.borrarHabilidad(id);
        return "La habilidad fue eliminada";
    }
    
    @GetMapping("/id/{habilidades_id}")
    public Habilidades getHabilidadesById (@PathVariable Long habilidades_id) {
        return habiServ.findHabilidadesById(habilidades_id);
    }
    
}
