package com.guidomaiola.demo.service;

import com.guidomaiola.demo.model.ShortURLModel;

import java.util.List;

public interface ShortURLService {
    String getShortURL(String originalURL);

    String getOriginalURL(String shortURL);

    List<String> getTop100FrequentURL();
}
