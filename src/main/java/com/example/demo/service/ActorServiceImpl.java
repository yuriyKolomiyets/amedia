package com.example.demo.service;

import com.example.demo.model.Actor;
import com.example.demo.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    @Override
    public Actor saveActorToDB(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor getActorFromDB(Long actorId) {
        return actorRepository.findById(actorId).orElseThrow();
    }
}
