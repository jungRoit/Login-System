/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao.impl;


import com.roit.demoApp.coreModule.dao.AssignedAdminsDAO;
import com.roit.demoApp.coreModule.entity.Admins;
import com.roit.demoApp.coreModule.entity.AssignedAdmins;
import com.roit.demoApp.coreModule.entity.SuperAdmins;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository(value = "assignedAdminDAO")
public class AssignedAdminsDAOimpl extends GenericDAOimpl<AssignedAdmins> implements AssignedAdminsDAO {

    @Override
    public AssignedAdmins getByusername(String username) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        AssignedAdmins assignedAdmin = (AssignedAdmins) session.createQuery("FROM AssignedAdmins as ad WHERE ad.createdBy = :username").setParameter("username", username).uniqueResult();

        return assignedAdmin;
    }

    @Override
    public List<AssignedAdmins> getAllByusername(SuperAdmins username) {
       session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        
        return session.createQuery("SELECT ad.adminId FROM AssignedAdmins as ad WHERE ad.createdBy = :username").setParameter("username", username).list();
    }

   
}
