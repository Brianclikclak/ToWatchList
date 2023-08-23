package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Film;

public interface FilmRespository extends JpaRepository<Film, Long> {

}
