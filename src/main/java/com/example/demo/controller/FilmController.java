package com.example.demo.controller;

import com.example.demo.converters.FilmConverter;
import com.example.demo.dto.FilmDto;
import com.example.demo.model.Film;
import com.example.demo.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequiredArgsConstructor
@RestController
public class FilmController {

    private final FilmService filmService;
    private final FilmConverter filmConverter;

    @RequestMapping(value = "/api/film/id/{id}", method = GET)
    public Film getFilm(@PathVariable Long filmId) {
        return filmService.get(filmId);
    }

    @PutMapping(value = "api/id/{id}/update")
    public Film sendNewFilmToProvider(@PathVariable Long id) {
        return filmService.sendNewFilmToProvider(id);
    }

    @PostMapping(value = "/film/create")
    public Film createFilm(@RequestBody FilmDto filmDto) {
        return filmService.save(filmConverter.convertFilmDtoToFilm(filmDto));
    }
}
