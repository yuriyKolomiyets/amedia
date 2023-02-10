package com.example.demo.dto;

import com.example.demo.model.Actor;
import com.example.demo.model.Language;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class FilmDto {

    private String filmName;
    private List<Actor> actorList;
    private Long year;
    private Long durationMin;
    private String description;
    private String maxQuality;
    private List<Language> languagesAudio;
}
