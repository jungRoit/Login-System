/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao;

import java.util.List;

/**
 *
 * @author User
 */
public interface GenericDAO<T> {
    List<T> getAll();
    T getById(int id);
    T getByusername(String username);
    void insert(T t);
    void update(T t);
    boolean delete(int id);
    
    
}
