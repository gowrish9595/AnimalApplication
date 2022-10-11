package com.example.AnimalApplication.behaviours.swim.impl;

import com.example.AnimalApplication.behaviours.swim.SwimmableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class NoSwimImpl implements SwimmableBehaviour {
    @Override
    public String swim() {
        return "cant swim";
    }
}
