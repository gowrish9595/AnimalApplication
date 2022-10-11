package com.example.AnimalApplication.behaviours.fly.impl;

import com.example.AnimalApplication.behaviours.fly.FlyableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize
public class NonFlyableBehaviourImpl implements FlyableBehaviour {
    @Override
    public String fly() {
        return "Cant fly";
    }
}
