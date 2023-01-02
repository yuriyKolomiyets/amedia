package com.example.demo.converters;

import com.example.demo.dto.FilmDto;
import com.example.demo.model.Film;
import com.example.demo.model.MaxQuality;

public class FilmConverter {

    private final IdGenerate idGenerate;
    private final ImdbRanking imdbRanking;

    public FilmConverter() {
        this.idGenerate = new IdGenerate();
        this.imdbRanking = new ImdbRanking();
    }

    public Film convertFilmDtoToFilm(FilmDto filmDto) {

        if (filmDto == null) {
            return null;
        }

        return Film.builder()
                .filmId(idGenerate.idGenerate())
                .filmName(filmDto.getFilmName())
                .actorList(filmDto.getActorList())
                .imdbRanking(imdbRanking.imdbRanking(filmDto.getFilmName()))
                .year(filmDto.getYear())
                .durationMin(filmDto.getDurationMin())
                .description(filmDto.getDescription())
                .maxQuality(Enum.valueOf(MaxQuality.class, filmDto.getMaxQuality()))
                .languagesAudio(filmDto.getLanguagesAudio())
                .languagesSubtitles(filmDto.getLanguagesSubtitles())
                .build();
    }
}
