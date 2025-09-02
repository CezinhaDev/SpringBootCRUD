package com.crud.demo.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.crud.demo.entity.User;
import com.crud.demo.repository.UserRepository;
import com.crud.demo.repository.UserRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;




// nessa parte de controller ele é responsavel por gerenciar as requisições HTTP ou seja gets e sets
@RestController
@RequestMapping("/users") // quando der o barra users, teremos acesso ao controller de usuários
public class UserControllers {

    @Autowired
    private UserRepository userRepository;

    @PostMapping // precisa indicar que este método responde a POST
    public ResponseEntity<String> createUser(@RequestBody UserRequest userRequest) {
        User user = new User(userRequest);
        userRepository.save(user);

        return ResponseEntity.ok("Sucesso");
    }

    @GetMapping("/path")
    public ResponseEntity listUser(){
        var user =  userRepository.findAll();
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable UUID id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("Usuário deletado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable UUID id, @RequestBody UserRequest userRequest) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) { // isPresent é para verificar se o usuário existe
            User existingUser = user.get();
            existingUser.setName(userRequest.name());
            existingUser.setEmail(userRequest.email());
            userRepository.save(existingUser);
            return ResponseEntity.ok("Usuário atualizado com sucesso");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
