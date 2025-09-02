package com.crud.demo.entity;

import java.util.UUID;

import com.crud.demo.repository.UserRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// entity é uma classe que representa um usuário no sistema
@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // essa linha é responsável por gerar o ID automaticamente
    private UUID id; // ESSE UUID É PARA MOSTRAR QUE O ID É ÚNICO
    private String name;
    private String email;

    public User(UserRequest userRequest){
        this.id = userRequest.id();
        this.name = userRequest.name();
        this.email = userRequest.email();
    }

}
