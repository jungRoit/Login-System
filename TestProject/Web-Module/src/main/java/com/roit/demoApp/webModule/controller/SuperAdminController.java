/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.webModule.controller;

import com.roit.demoApp.coreModule.dao.AdminsDAO;
import com.roit.demoApp.coreModule.dao.AssignedAdminsDAO;
import com.roit.demoApp.coreModule.dao.AssignedToDAO;
import com.roit.demoApp.coreModule.dao.SuperAdminsDAO;
import com.roit.demoApp.coreModule.dao.UsersDAO;
import com.roit.demoApp.coreModule.entity.Admins;
import com.roit.demoApp.coreModule.entity.AssignedAdmins;
import com.roit.demoApp.coreModule.entity.AssignedTo;
import com.roit.demoApp.coreModule.entity.SuperAdmins;
import com.roit.demoApp.coreModule.entity.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author User
 */
@Controller
@RequestMapping(value = "/superAdmin")
public class SuperAdminController {

    @Autowired
    UsersDAO usersDAO;
    @Autowired
    AdminsDAO adminsDAO;
    @Autowired
    AssignedToDAO assignedToDAO;
    @Autowired
    SuperAdminsDAO superAdminsDAO;
    @Autowired
    AssignedAdminsDAO assignedAdminsDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
         SuperAdmins superAdmin=superAdminsDAO.getByusername(SecurityContextHolder.getContext().getAuthentication().getName());
         
         model.addAttribute("user", assignedAdminsDAO.getAllByusername(superAdmin));
        
        return "superAdmin/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "superAdmin/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Admins admin) {

        SuperAdmins superAdmin=superAdminsDAO.getByusername(SecurityContextHolder.getContext().getAuthentication().getName());
        
        AssignedAdmins assignedAdmin=new AssignedAdmins(0, superAdmin, admin);
        
        adminsDAO.insert(admin);
        assignedAdminsDAO.insert(assignedAdmin);
        return "redirect:/superAdmin";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", adminsDAO.getById(id));
        return "superAdmin/edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Admins admin) {

        adminsDAO.update(admin);
        return "redirect:/superAdmin";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        adminsDAO.delete(id);
        return "redirect:/superAdmin";
    }

    @RequestMapping(value = "/assign", method = RequestMethod.GET)
    public String assign() {
        return "superAdmin/assign";
    }
    
    @RequestMapping( value = "/saveAssign", method = RequestMethod.POST)
    public String saveAssign(@ModelAttribute("createdBy")String createdBy,@ModelAttribute("userId")String userId){
        Admins admin=adminsDAO.getByusername(createdBy);
        Users user=usersDAO.getByusername(userId);
        AssignedTo assignedTo=new AssignedTo(0, user, admin);
        
        assignedToDAO.insert(assignedTo);
         return "redirect:/superAdmin";
    }
    
     @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String users(@PathVariable("id") int id, Model model) {
         Admins admin=adminsDAO.getById(id);
         
         model.addAttribute("user", assignedToDAO.getAllByusername(admin));
               
         
        return "superAdmin/Users";
    }
    
    
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String addUsers() {
        return "superAdmin/addUsers";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public String saveUsers( Users user) {
        usersDAO.insert(user);
        return "redirect:/superAdmin";
    }

    @RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
    public String editUsers(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", usersDAO.getById(id));
        return "superAdmin/editUsers";
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public String updateUsers( Users user) {
            
        usersDAO.update(user);
        return "redirect:/superAdmin";
    }

    @RequestMapping(value = "/user/delete/{id}")
    public String deleteusers(@PathVariable("id") int id) {
        usersDAO.delete(id);
        return "redirect:/superAdmin";
    }

}
