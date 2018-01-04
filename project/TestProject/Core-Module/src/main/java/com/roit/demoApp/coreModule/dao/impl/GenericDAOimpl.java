 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao.impl;

import com.roit.demoApp.coreModule.dao.GenericDAO;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author User
 * @param <T>
 */
public class GenericDAOimpl<T> implements GenericDAO<T>{
    
    @Autowired
    protected SessionFactory sessionFactory;
    protected Session session;
    protected Transaction transaction;
    protected Class<T> paramClass;

    public GenericDAOimpl() {
        paramClass=(Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    

    @Override
    public List getAll() {
        session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(paramClass);
        return criteria.list();
    }

    @Override
    public T getById(int id) {
       session=sessionFactory.openSession();
       transaction=session.beginTransaction();
       T t=(T)session.get(paramClass, id);
       session.close();
       return t;
    }

    @Override
    public void insert(T t) {
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
        session.save(t);
        transaction.commit();
        session.close();
        
    }

    @Override
    public void update(T t) {
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
        session.update(t);
        transaction.commit();
        session.close();
    }

    @Override
    public boolean delete(int id) {
        T t=getById(id);
        if(t==null){
            return false;
        }
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
        session.delete(t);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public T getByusername(String username) {
       session=sessionFactory.openSession();
       transaction=session.beginTransaction();
       T t=(T)session.get(paramClass, username);
       session.close();
       return t;
   
    }
    
    
}
