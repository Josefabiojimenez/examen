/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import controller.peliculaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Admin
 */
public class pelicula {
     @PostMapping("/save")
    public String guardarpelicula(@ModelAttribute pelicula pelicula) {
        personaService.savepelicula(pelicula);
        return "redirect:/pelicula";
    }

    @GetMapping("/edit/{pelicula}")
    public String editarpelicula(@PathVariable("id") Long idpelicula, Model model) {
        pelicula pelicula = peliculaService.getpeliculaById(idpelicula);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable("pelicula") Long idpelicula) {
        peliculaService.delete(idpelicula);
        return "redirect:/pelicula";
    }
    
}

