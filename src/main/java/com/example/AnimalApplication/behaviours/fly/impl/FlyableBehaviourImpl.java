package com.example.AnimalApplication.behaviours.fly.impl;

import com.example.AnimalApplication.behaviours.fly.FlyableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class FlyableBehaviourImpl implements FlyableBehaviour {
    @Override
    public String fly() {
        return "Can fly";
    }
}
