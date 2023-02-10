package com.example.demo.service;

import com.example.demo.model.Film;

public interface FilmService {

    Film save(Film film);
    Film get(Long filmId);
    Film sendNewFilmToProvider(Long id);
}
