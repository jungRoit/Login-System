/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao;


import com.roit.demoApp.coreModule.entity.AssignedAdmins;
import com.roit.demoApp.coreModule.entity.SuperAdmins;
import java.util.List;

/**
 *
 * @author User
 */
public interface AssignedAdminsDAO extends GenericDAO<AssignedAdmins>{
    List<AssignedAdmins> getAllByusername(SuperAdmins username);
    
}
