package com.guidomaiola.demo.controller;

import com.guidomaiola.demo.service.ShortURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("/")
public class ShortURLController {


    private ShortURLService shortURLService;
    @PostMapping
    String getShortURL(String originalURL) {
        return shortURLService.getShortURL(originalURL);
    }

    @GetMapping(value = "/shortURL")
    String getOriginalURL(String shortURL){
        return null;
    }

    @GetMapping(value = "/top100")
    List<String> getTop100FrequentURL(){

        return null;
    }
}
