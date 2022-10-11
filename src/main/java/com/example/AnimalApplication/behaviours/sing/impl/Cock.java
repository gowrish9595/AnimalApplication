package com.example.AnimalApplication.behaviours.sing.impl;

import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class Cock implements SingableBehaviour {
    @Override
    public String sing() {
        return "Cock-a-doodle-doo";
    }
}
