
package com.portfolio.proyecto.controller;

import com.portfolio.proyecto.entity.User;
import com.portfolio.proyecto.service.SUser;
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
@RequestMapping("/user")
public class CUser {
    @Autowired
    SUser userServ;
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<User> verUsers () {
        return userServ.getUsers();
    }

    @PostMapping ("/new")
    public void addUser (@RequestBody User user) throws Exception {
        userServ.saveUser(user);
    }
    
    @GetMapping("/id/{id}")
    public User getUserById (@PathVariable Long id) {
        return userServ.findUserById(id);
    }

    @GetMapping("/email/{email}")
    public User getUserByEmail (@PathVariable("email") String email) {
        return userServ.findUserByEmail(email);
    }

    @DeleteMapping ("/delete/{id}")
    public void eliminarUser (@PathVariable("id") Long id) {
        userServ.deleteUser(id);
    }
    
}
