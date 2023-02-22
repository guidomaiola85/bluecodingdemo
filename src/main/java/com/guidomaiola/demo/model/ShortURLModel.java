package com.guidomaiola.demo.model;

public class ShortURLModel {

    String URL;

    public ShortURLModel(String URL) {
        this.URL = URL;
    }

    @Override
    public boolean equals(Object obj) {
        return this.URL == obj.toString();
    }

    @Override
    public int hashCode() {
        return URL.hashCode();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
