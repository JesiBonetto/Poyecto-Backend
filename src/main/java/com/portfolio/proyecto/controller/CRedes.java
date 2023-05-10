
package com.portfolio.proyecto.controller;

import com.portfolio.proyecto.entity.Redes;
import com.portfolio.proyecto.service.SRedes;
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
@RequestMapping("/redes")
public class CRedes {
    @Autowired
    SRedes reServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Redes> verRedes() {
        return reServ.verRedes();
    }
    
    @PostMapping("/new")
    public String agregarRed(@RequestBody Redes re) {
        reServ.crearRed(re);
        return "La red fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarRed(@PathVariable Long id) {
        reServ.borrarRed(id);
        return "La red fue eliminada";
    }
    
    @GetMapping("/id/{redes_id}")
    public Redes getRedesById (@PathVariable Long redes_id) {
        return reServ.findRedesById(redes_id);
    }
    
}
