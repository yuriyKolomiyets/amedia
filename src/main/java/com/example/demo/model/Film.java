package com.example.demo.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Film {

    private Long filmId;
    private String filmName;
    private List<Actor> actorList;
    private Long imdbRanking;
    private Long year;
    private Long durationMin;
    private String description;
    private Enum <MaxQuality> maxQuality;
    private List<String> languagesAudio;
    private List<String> languagesSubtitles;

}
