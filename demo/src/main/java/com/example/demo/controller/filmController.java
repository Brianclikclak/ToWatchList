package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.FilmService;

@RestController
@RequestMapping

@Controller
public class FilmController {

    @Autowired
    private FilmService service;

    @GetMapping({ "/films", "/" })
    public String listFilms(Model model) {
        model.addAttribute("films", service.listAllFilms());
        return "films";
    }
}