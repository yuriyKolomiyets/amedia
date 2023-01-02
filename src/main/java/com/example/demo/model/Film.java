package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.sound.sampled.AudioFileFormat;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmId;
    private String filmName;
    private List<Actor> actorList;
    private Integer imdbRanking;
    private Long year;
    private Long durationMin;
    private String description;
    private Enum <MaxQuality> maxQuality;

    @ManyToMany
    private List <Language> languagesAudio;

    @ManyToMany
    private List <Language> languagesSubtitles;

}
