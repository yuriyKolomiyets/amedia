package com.example.demo.converters;

import com.example.demo.dto.ImdbJsonModel;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ImdbRanking {

    private final String host;
    private final RestTemplate restTemplate = new RestTemplate();

    public ImdbRanking() {
        this.host ="https://api.agify.io/?name=";
    }

    public Integer imdbRanking(String name){
        ImdbJsonModel json = restTemplate.getForObject(
                urlBuilder(name), ImdbJsonModel.class);
        return json.count;
    }

    private String urlBuilder(String name) {
        return host +  name;
    }

}


