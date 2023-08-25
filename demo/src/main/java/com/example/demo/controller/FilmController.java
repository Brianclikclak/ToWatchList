package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Film;
import com.example.demo.services.FilmService;

@RestController
@RequestMapping

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
    public Film update(@RequestBody Film filmDetails, @PathVariable(value = "id") Long userId) {

        filmDetails.setTitle(filmDetails.getTitle());
        filmDetails.setDate(filmDetails.getDate());
        filmDetails.setGenre(filmDetails.getGenre());
        filmDetails.setDirector(filmDetails.getDirector());

        return filmDetails.body(filmService.save(Film.get()));

    }

}
