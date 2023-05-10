
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.entity.User;
import java.util.List;


public interface ISUser {
    
     public List<User> getUsers ();

    public User saveUser (User user) throws Exception;

    public void deleteUser (Long id);

    public User findUser (Long id);

    public User findUserByEmail (String email);
    
}
