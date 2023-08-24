package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

    List<Film> listAllFilms();

}
