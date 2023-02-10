package com.example.demo.service;

import com.example.demo.model.Film;
import com.example.demo.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Override
    public Film save(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film get(Long filmId) {
        return filmRepository.findById(filmId).orElseThrow();
    }

    @Override
    public Film sendNewFilmToProvider(Long id) {
        return null;
    }
}
