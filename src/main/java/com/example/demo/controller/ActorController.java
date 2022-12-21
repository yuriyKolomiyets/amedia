package com.example.demo.controller;

import com.example.demo.converters.ActorConverter;
import com.example.demo.dto.ActorDto;
import com.example.demo.dto.FilmDto;
import com.example.demo.model.Actor;
import com.example.demo.model.Film;
import com.example.demo.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequiredArgsConstructor
@RestController
public class ActorController {

    private final ActorService actorService;
    private final ActorConverter actorConverter;

    @RequestMapping(value = "/api/actor/id/{id}}", method = GET)
    public Actor getActor(@PathVariable Long actorId) {
        return actorService.getActorFromDB(actorId);
    }

    @PostMapping(value = "/actor/create")
    public Actor createActor(@RequestBody ActorDto actorDto) {
        return actorService.saveActorToDB(actorConverter.convertActorDtoToActor(actorDto));
    }
}
