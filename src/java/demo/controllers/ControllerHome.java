/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author prabi
 */
@Controller
@Configuration
public class ControllerHome {
    
    @RequestMapping("/home")
    public String home () {
        return "home";
    }
}
