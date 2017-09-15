/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.geo.controller;

import br.com.geo.model.Model;
import java.io.FileNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Raphael Moreno
 */

@Controller
public class ControllerGeolocals {

 
    @RequestMapping("/geoMaps")
    public String iniciando(){
        return "index";       
    }
    
}
