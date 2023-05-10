
package com.portfolio.proyecto.controller;

import com.portfolio.proyecto.entity.Proyectos;
import com.portfolio.proyecto.service.SProyectos;
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
@RequestMapping("/proyectos")
public class CProyectos {
    @Autowired
    SProyectos proyeServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proyeServ.verProyectos();
    }
    
    @PostMapping("/new")
    public String agregarProyecto(@RequestBody Proyectos pro) {
        proyeServ.crearProyecto(pro);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        proyeServ.borrarProyecto(id);
        return "El proyecto fue eliminado";
    }
    
    @GetMapping("/id/{proyectos_id}")
    public Proyectos getProyectosById (@PathVariable Long proyectos_id) {
        return proyeServ.findProyectosById(proyectos_id);
    }
}
