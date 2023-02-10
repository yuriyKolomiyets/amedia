package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filmName;

    @ManyToMany
    @JoinTable(name = "actor_list",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actorList;

    private Integer imdbRanking;
    private Long year;
    private Long durationMin;
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private Enum <MaxQuality> maxQuality;

    @OneToMany(mappedBy="film")
    private List <Language> languagesAudio;

}
