
package com.portfolio.proyecto.controller;

import com.portfolio.proyecto.entity.Persona;
import com.portfolio.proyecto.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class CPersona {
    @Autowired
    SPersona persoServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    
    @PostMapping("/new")
    public String agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return "La persona fue eliminada";
    }
    @PutMapping("personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("edad") int nuevaEdad,
            @RequestParam("ciudad") String nuevaCiudad,
            @RequestParam("sobreMi") String nuevoSobreMi,
            @RequestParam("foto") String nuevaFoto,
            @RequestParam("baner") String nuevoBaner) {
        
        Persona perso = persoServ.buscarPersona(id);

        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevaEdad);
        perso.setCiudad(nuevaCiudad);
        perso.setSobre_mi(nuevoSobreMi);
        perso.setFoto(nuevaFoto);
        perso.setBaner(nuevoBaner);
        persoServ.crearPersona(perso);

        return perso;
    }
    
    @GetMapping("/id/{persona_id}")
    public Persona getPersonaById (@PathVariable Long persona_id) {
        return persoServ.findPersonaById(persona_id);
    }
}
