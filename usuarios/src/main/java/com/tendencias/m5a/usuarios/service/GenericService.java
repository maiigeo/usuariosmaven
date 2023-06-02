/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5a.usuarios.service;

import java.util.List;
import java.io.Serializable;

/**
 *
 * @author HP
 * @param <T>
 * @param <ID>
 */
public interface GenericService <T, ID extends Serializable>{

    public T save(T entity);

    public T findById(ID id);

    public List<T> findByAll();

    public void delete(ID id);


}