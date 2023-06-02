/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5a.usuarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id_usuario;

    @Size(min = 3, max = 10, message = "El usuario debe tener entre 3 y 10 caracteres")
    @NotBlank(message = "El usuario no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;
    
    @NotBlank(message = "La clave no puede estar en blanco")
    @Column(name = "clave")
    private String clave;

    @Email(message = "Debe ingresar una dirección de correo válida")
    @Column(name = "email")
    private String email;
    
    @Column(name = "estado")
    private int estado;
    
    
    
}
