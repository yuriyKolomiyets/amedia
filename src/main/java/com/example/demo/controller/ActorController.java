package com.example.demo.controller;

import com.example.demo.converters.ActorConverter;
import com.example.demo.dto.ActorDto;
import com.example.demo.model.Actor;
import com.example.demo.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ActorController {

    private final ActorService actorService;
    private final ActorConverter actorConverter;

    @GetMapping(value = "/actor/id/{id}")
    public Actor getActor(@PathVariable Long actorId) {
        return actorService.get(actorId);
    }

    @PostMapping(value = "/actor/create")
    public Actor createActor(@RequestBody ActorDto actorDto) {
        return actorService.save(actorConverter.convertActorDtoToActor(actorDto));
    }
}
