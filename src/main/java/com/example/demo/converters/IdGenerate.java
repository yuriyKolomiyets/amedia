package com.example.demo.converters;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerate {

    private final AtomicLong counter = new AtomicLong(0);

    public Long idGenerate(){
        return counter.incrementAndGet();
    }

}
