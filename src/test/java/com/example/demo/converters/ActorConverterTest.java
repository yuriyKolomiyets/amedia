package com.example.demo.converters;

import com.example.demo.dto.ActorDto;
import com.example.demo.model.Actor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorConverterTest {

    ActorConverter actorConverter;

    @BeforeEach
    void setUp() {

        actorConverter = new ActorConverter();
    }

    @Test
    void convertActorDtoToActor() {

        //given
        ActorDto actorDto = new ActorDto();
        actorDto.setCountry("UA");
        actorDto.setLastName("LN");

        //when
        Actor actor = actorConverter.convertActorDtoToActor(actorDto);

        //then
        assertEquals("UA", actor.getCountry());
        assertEquals("LN", actor.getLastName());
    }
}