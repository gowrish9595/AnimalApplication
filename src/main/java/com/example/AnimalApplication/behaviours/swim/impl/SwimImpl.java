package com.example.AnimalApplication.behaviours.swim.impl;

import com.example.AnimalApplication.behaviours.swim.SwimmableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class SwimImpl implements SwimmableBehaviour {
    @Override
    public String swim() {
        return "can swim";
    }
}
