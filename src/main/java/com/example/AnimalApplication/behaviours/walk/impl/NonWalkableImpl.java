package com.example.AnimalApplication.behaviours.walk.impl;

import com.example.AnimalApplication.behaviours.walk.WalkableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class NonWalkableImpl implements WalkableBehaviour {
    @Override
    public String walk() {
        return "cant walk";
    }
}
