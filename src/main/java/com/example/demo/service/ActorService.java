package com.example.demo.service;

import com.example.demo.model.Actor;

public interface ActorService {

    Actor save(Actor actor);
    Actor get(Long actorId);
}
