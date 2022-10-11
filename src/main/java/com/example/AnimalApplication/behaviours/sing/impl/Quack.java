package com.example.AnimalApplication.behaviours.sing.impl;

import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class Quack implements SingableBehaviour {
    @Override
    public String sing() {
        return "Quack , quack";
    }
}
