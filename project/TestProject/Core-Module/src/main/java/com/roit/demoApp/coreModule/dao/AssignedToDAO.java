/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.dao;

import com.roit.demoApp.coreModule.entity.Admins;
import com.roit.demoApp.coreModule.entity.AssignedTo;
import java.util.List;

/**
 *
 * @author User
 */
public interface AssignedToDAO extends GenericDAO<AssignedTo>{
    List<AssignedTo> getAllByusername(Admins username);
    
}
