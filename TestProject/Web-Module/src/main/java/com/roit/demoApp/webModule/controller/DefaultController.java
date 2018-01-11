/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.webModule.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author User
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        Authentication auth=SecurityContextHolder.getContext().getAuthentication();
        if(!(auth instanceof AnonymousAuthenticationToken)){
            UserDetails ud=(UserDetails)auth.getPrincipal();
            System.out.println(ud.getAuthorities().toString());
            if(ud.getAuthorities().toString().equalsIgnoreCase("[ROLE_ADMIN]")){
                return "redirect:/admin";
            }else if(ud.getAuthorities().toString().equalsIgnoreCase("[ROLE_SUPER_ADMIN]")){
                return "redirect:/superAdmin";
            }else{
                return "redirect:/user";
            }
        }
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model,@RequestParam(value = "error",required = false)String error, @RequestParam(value = "logout",required = false)String logout) {
        if(error!=null){
             model.addAttribute("msg", "username or password is invalid");
        }
        if(logout!=null){
            model.addAttribute("msg", "Logout Succesful");
        }
        
        return "login";
    }

    public String accseeDenied() {
        return "403";
    }
}
