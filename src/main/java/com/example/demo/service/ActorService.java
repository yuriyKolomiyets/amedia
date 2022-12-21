package com.example.demo.service;

import com.example.demo.model.Actor;
import com.example.demo.model.Film;

public interface ActorService {

    Actor saveActorToDB(Actor actor);
    Actor getActorFromDB(Long actorId);
}
