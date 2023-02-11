package com.example.demo.service;

import com.example.demo.model.Film;
import com.example.demo.repository.FilmRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class FilmServiceImplTest {

    FilmService filmService;
    Film film = new Film();


    @Mock
    FilmRepository filmRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        film.setFilmName("Titanic");
        film.setId(1L);
        filmService = new FilmServiceImpl(filmRepository);
    }

    @Test
    void save() {

        when(filmRepository.save(any())).thenReturn(film);
        assertEquals(filmService.save(film), film);

    }

    @Test
    void get() {
        when(filmRepository.findById(1L)).thenReturn(Optional.ofNullable(film));
        assertEquals(filmService.get(1L), film);
        assertThrows(Exception.class, () -> filmService.get(2L));
    }

}