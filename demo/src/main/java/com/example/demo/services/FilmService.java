package com.example.demo.services;

import java.util.Optional;

import com.example.demo.models.Film;

public interface FilmService {

    public Iterable<Film> findAll();

    public Optional<Film> findById(Long id);

    public Film save(Film film);

    public void deleteById(Long id);

    public Film updateFilmById(Long id, Film filmDetails);
}
