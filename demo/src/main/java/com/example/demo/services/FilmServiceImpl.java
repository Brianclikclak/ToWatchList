package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Film;
import com.example.demo.repository.FilmRespository;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRespository repository;

    @Override
    public List<Film> listAllFilms() {

        return repository.findAll();
    }

}
