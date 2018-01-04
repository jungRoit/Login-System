/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.webModule.controller;

import com.roit.demoApp.coreModule.dao.AdminsDAO;
import com.roit.demoApp.coreModule.dao.AssignedToDAO;
import com.roit.demoApp.coreModule.dao.UsersDAO;
import com.roit.demoApp.coreModule.entity.Admins;
import com.roit.demoApp.coreModule.entity.AssignedTo;
import com.roit.demoApp.coreModule.entity.Users;
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
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    UsersDAO usersDAO;
    @Autowired
    AssignedToDAO assignedToDAO;
    @Autowired
    AdminsDAO adminsDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
       
        Admins admin=adminsDAO.getByusername(SecurityContextHolder.getContext().getAuthentication().getName());
         
         model.addAttribute("user", assignedToDAO.getAllByusername(admin));
        
        return "admin/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "admin/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Users user) {
        Admins admin=adminsDAO.getByusername(SecurityContextHolder.getContext().getAuthentication().getName());
       AssignedTo assignedTo=new AssignedTo(0, user, admin);

        usersDAO.insert(user);
        assignedToDAO.insert(assignedTo);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", usersDAO.getById(id));
        return "admin/edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update( Users user) {
            
        usersDAO.update(user);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        usersDAO.delete(id);
        return "redirect:/admin";
    }

   



}
