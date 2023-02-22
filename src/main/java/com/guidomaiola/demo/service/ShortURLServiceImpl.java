package com.guidomaiola.demo.service;

import com.guidomaiola.demo.model.ShortURLModel;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ShortURLServiceImpl implements ShortURLService {

    LinkedHashMap<String, ShortURLModel> hashedURLs = new LinkedHashMap<>();
    public String getShortURL(String originalURL) {
        if (hashedURLs.containsValue(originalURL)) {
            return hashedURLs.get(originalURL).getURL();
        }
        return hashedURLs.put(originalURL, new ShortURLModel(originalURL)).getURL();
    }

    public String getOriginalURL(ShortURLModel shortURL){
        // Return a key by value, shortURL
        return hashedURLs.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), shortURL))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).get(0);
    }

    public List<String> getTop100FrequentURL(){
        return null;
    }
}
