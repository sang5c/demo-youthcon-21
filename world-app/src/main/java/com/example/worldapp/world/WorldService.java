package com.example.worldapp.world;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WorldService {

    public ResponseEntity<String> callHi() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity("http://localhost:8082/hi", String.class);
    }

}
