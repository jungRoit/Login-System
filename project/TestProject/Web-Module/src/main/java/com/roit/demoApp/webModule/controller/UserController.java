/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.webModule.controller;

import com.roit.demoApp.coreModule.dao.UsersDAO;
import com.roit.demoApp.coreModule.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author User
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UsersDAO  usersDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model,Users user){
        user=usersDAO.getByusername(SecurityContextHolder.getContext().getAuthentication().getName());
 
       model.addAttribute("user",user);
        return "user/index";
    }
}
