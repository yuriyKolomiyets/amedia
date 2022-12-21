package com.example.demo.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

    private Long actorId;
    private String name;
    private String lastName;
    private String country;

}
