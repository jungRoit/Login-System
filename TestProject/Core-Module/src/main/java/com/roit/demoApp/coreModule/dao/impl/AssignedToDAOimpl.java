/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao.impl;

import com.roit.demoApp.coreModule.dao.AssignedToDAO;
import com.roit.demoApp.coreModule.entity.Admins;
import com.roit.demoApp.coreModule.entity.AssignedTo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository(value = "assignedToDAO")
public class AssignedToDAOimpl extends GenericDAOimpl<AssignedTo> implements AssignedToDAO {

    @Override
    public AssignedTo getByusername(String username) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        AssignedTo assignedTo = (AssignedTo) session.createQuery("FROM AssignedTo as ad WHERE ad.createdBy = :username").setParameter("username", username).uniqueResult();

        return assignedTo;
    }

    @Override
    public List<AssignedTo> getAllByusername(Admins username) {
       session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        
        return session.createQuery("SELECT ad.userId FROM AssignedTo as ad WHERE ad.createdBy = :username").setParameter("username", username).list();
    }
}
