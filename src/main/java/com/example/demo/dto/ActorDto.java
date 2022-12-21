package com.example.demo.dto;

import com.example.demo.model.Film;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class ActorDto {

    private String name;
    private String lastName;
    private String country;
}
