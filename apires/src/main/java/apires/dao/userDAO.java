package apires.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import apires.model.user;

public interface userDAO extends JpaRepository<user,Integer>{
    
}
