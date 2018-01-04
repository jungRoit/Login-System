/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao.impl;

import com.roit.demoApp.coreModule.dao.AdminsDAO;
import com.roit.demoApp.coreModule.entity.Admins;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository(value = "adminsDAO")
public class AdminsDAOimpl extends GenericDAOimpl<Admins> implements AdminsDAO {
    
      @Override
    public Admins getByusername(String username) {
       session=sessionFactory.openSession();
       transaction=session.beginTransaction();
        Admins admin=(Admins)session.createQuery("FROM Admins as ad WHERE ad.username = :username").setParameter("username", username).uniqueResult();
        
       return admin;
   
    }
}
