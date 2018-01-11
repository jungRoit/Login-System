/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao.impl;

import com.roit.demoApp.coreModule.dao.SuperAdminsDAO;
import com.roit.demoApp.coreModule.entity.SuperAdmins;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository(value = "superAdminsDAO")
public class SuperAdminsDAOimpl extends GenericDAOimpl<SuperAdmins> implements SuperAdminsDAO {
    
      @Override
    public SuperAdmins getByusername(String username) {
       session=sessionFactory.openSession();
       transaction=session.beginTransaction();
        SuperAdmins superAdmin=(SuperAdmins)session.createQuery("FROM SuperAdmins as ad WHERE ad.username = :username").setParameter("username", username).uniqueResult();
        
       return superAdmin;
   
    }
}
