/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao.impl;

import com.roit.demoApp.coreModule.dao.UsersDAO;
import com.roit.demoApp.coreModule.entity.Users;
import com.roit.demoApp.coreModule.entity.Users;
import com.roit.demoApp.coreModule.entity.Users;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository(value = "usersDAO")
public class UsersDAOimpl extends GenericDAOimpl<Users> implements UsersDAO{
    @Override
    public Users getByusername(String username) {
       session=sessionFactory.openSession();
       transaction=session.beginTransaction();
        Users user=(Users)session.createQuery("FROM Users as ad WHERE ad.username = :username").setParameter("username", username).uniqueResult();
        
       return user;
   
    }
    
}
