package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.animals.Fish;

public class Shark extends Fish {
    public Shark() {
        size = "large";
        color = "grey";
    }

    String makeJokes() {
        return "make jokes";
    }
}
