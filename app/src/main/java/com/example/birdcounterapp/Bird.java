package com.example.birdcounterapp;

public class Bird {

    String name;
    int count;
    String imageLocation;

    public Bird() {

    }

    public Bird(String name, int count, String imageLocation) {
        this.name = name;
        this.count = count;
        this.imageLocation = imageLocation;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public String getImageLocation() {
        return imageLocation;
    }
}
