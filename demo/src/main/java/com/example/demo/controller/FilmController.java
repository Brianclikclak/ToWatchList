package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Film;
import com.example.demo.services.FilmService;

@RestController
@RequestMapping("/films")
@CrossOrigin("*")

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping
    public Film saveFilm(@RequestBody Film film) {
        return (filmService.save(film));

    }

    @GetMapping("/{id}")
    public Optional<Film> getFilmById(@PathVariable Long id) {
        return filmService.findById(id);
    }

    @GetMapping
    public List<Film> readAll() {
        return StreamSupport
                .stream(filmService.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public Film updateFilmById(@PathVariable Long id, @RequestBody Film filmDetails) {
        return (filmService.updateFilmById(id, filmDetails));
    };

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        filmService.deleteById(id);
    };

}
