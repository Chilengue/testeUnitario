package api.api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.api.domain.User;
import api.api.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserResourece {

     @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity <User> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.findById(id));
    }
    
}
