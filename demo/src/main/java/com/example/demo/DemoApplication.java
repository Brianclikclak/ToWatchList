package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Film;
import com.example.demo.repository.FilmRespository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private FilmRespository respository;

	@Override
	public void run(String... args) throws Exception {

		Film film1 = new Film("A todo gas", 2000, "Accion", "Louis Leterrier");
		respository.save(film1);

		Film film2 = new Film("A todo gas 2", 2002, "Accion", "Louis Leterrier");
		respository.save(film2);

		Film film3 = new Film("A todo gas 3 ", 2003, "Accion", "Louis Leterrier");
		respository.save(film3);

	}

}
