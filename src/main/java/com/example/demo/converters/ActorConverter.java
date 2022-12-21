package com.example.demo.converters;

import com.example.demo.dto.ActorDto;
import com.example.demo.model.Actor;

public class ActorConverter {

    private final IdGenerate idGenerate;

    public ActorConverter() {
        this.idGenerate = new IdGenerate();
    }

    public Actor convertActorDtoToActor(ActorDto actorDto) {

        if (actorDto == null) {
            return null;
        }
        return Actor.builder()
                .actorId(idGenerate.idGenerate())
                .country(actorDto.getCountry())
                .lastName(actorDto.getLastName())
                .name(actorDto.getName())
                .build();
    }
}
