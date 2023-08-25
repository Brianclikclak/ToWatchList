package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Film;
import com.example.demo.repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository filmrepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Film> findAll() {
        return filmrepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Film> findById(Long id) {
        return filmrepository.findById(id);
    }

    @Override
    @Transactional
    public Film save(Film film) {
        return filmrepository.save(film);
    }

    @Override
    public void deleteById(Long id) {
        filmrepository.deleteById(id);
    }

    @Override
    public Film updateFilmById(Long id, Film filmDetails) {

        filmDetails.setTitle(filmDetails.getTitle());
        filmDetails.setDate(filmDetails.getDate());
        filmDetails.setGenre(filmDetails.getGenre());
        filmDetails.setDirector(filmDetails.getDirector());

        filmrepository.save(filmDetails);
        return filmDetails;
    }


//    public Film update(@RequestBody Film filmDetails, @PathVariable(value = "id") Long userId) {
//
//        filmDetails.setTitle(filmDetails.getTitle());
//        filmDetails.setDate(filmDetails.getDate());
//        filmDetails.setGenre(filmDetails.getGenre());
//        filmDetails.setDirector(filmDetails.getDirector());
//
//        return filmDetails.body(filmService.save(Film.get()));
//    }



}
