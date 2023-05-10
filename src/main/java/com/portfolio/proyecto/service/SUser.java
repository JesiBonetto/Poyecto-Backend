
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.User;
import com.portfolio.proyecto.repository.IUser;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SUser implements ISUser{
    @Autowired
    IUser iUser;
            
    @Override
    public User saveUser(User user) throws Exception {
        User userEmail = iUser.findByEmail(user.getEmail());
        if(userEmail != null)  {
            System.out.println("Este correo ya está en uso");
            throw new Exception("Este correo electrónico ya se encuentra registrado.");
        } else {
            iUser.save(user);
        }
        return user;
    }

    @Override
    public List<User> getUsers() {
        return iUser.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        iUser.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        return iUser.findById(id).orElse(null);
    }

    @Override
    public User findUserByEmail(String email) {
         return iUser.findByEmail(email);
    }

    public User findUserById(Long id) {
        return iUser.findById(id).orElse(null);
    }
    
}
