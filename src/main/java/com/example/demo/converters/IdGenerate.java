package com.example.demo.converters;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class IdGenerate {

    private final AtomicLong counter = new AtomicLong(0);

    public Long idGenerate(){
        return counter.incrementAndGet();
    }

}
