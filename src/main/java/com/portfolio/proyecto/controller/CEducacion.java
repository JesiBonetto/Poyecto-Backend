
package com.portfolio.proyecto.controller;

import com.portfolio.proyecto.entity.Educacion;
import com.portfolio.proyecto.service.SEducacion;
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
@RequestMapping("/educacion")
public class CEducacion {
    @Autowired
    SEducacion eduServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> verEducaciones() {
        return eduServ.verEducaciones();
    }
    
    @PostMapping("/new")
    public String agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
        return "La educacion fue eliminada";
    }
    
    @GetMapping("/id/{educacion_id}")
    public Educacion getEducacionById (@PathVariable Long educacion_id) {
        return eduServ.findEducacionById(educacion_id);
    }
    
}
