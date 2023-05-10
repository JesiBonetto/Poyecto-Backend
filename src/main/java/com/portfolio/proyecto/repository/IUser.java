
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends JpaRepository<User,Long>{

    public User findByEmail(String email);
    
}
