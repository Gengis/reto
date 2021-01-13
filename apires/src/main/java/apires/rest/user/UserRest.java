package apires.rest.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import apires.dao.userDAO;
import apires.model.user;

@RestController
@RequestMapping("api")
public class UserRest {

    @Autowired
    private userDAO userDAO;

    @GetMapping("/v1/users")//localhost:8080/api/v1/users
    public List<user> listar() {
        return userDAO.findAll();
    }

    @GetMapping("/v1/users/{id}")//localhost:8080/api/v1/users/{id}
    public Optional<user> listar(@PathVariable("id") Integer id) {
        return userDAO.findById(id);
    }


    @PostMapping("v1/users")//localhost:8080/api/v1/users
    public void guardar(@RequestBody user user){
        userDAO.save(user);
    }


    
    @PutMapping("/v1/users/{id}")//localhost:8080/api/v1/users/{id}
    public void actualizar(@RequestBody user user){
        userDAO.save(user);
        
    }

    @DeleteMapping("/v1/users/{id}")//localhost:8080/api/v1/users/{id}
    public void eliminar(@PathVariable("id")Integer id){
            userDAO.deleteById(id);
        }
    

}
