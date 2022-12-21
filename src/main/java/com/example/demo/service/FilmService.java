package com.example.demo.service;

import com.example.demo.model.Film;

public interface FilmService {

    Film saveFilmToDB(Film film);
    Film getFilmFromDB(Long filmId);
    Film sendNewFilmToProvider(Long id);
}
