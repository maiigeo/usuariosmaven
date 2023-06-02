/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5a.usuarios.service;

import com.tendencias.m5a.usuarios.model.Usuario;
import com.tendencias.m5a.usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
/**
 *
 * @author HP
 */
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Integer> implements GenericService<Usuario, Integer>{
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public CrudRepository<Usuario, Integer> getDao() {
        return usuarioRepository;
    }
}
