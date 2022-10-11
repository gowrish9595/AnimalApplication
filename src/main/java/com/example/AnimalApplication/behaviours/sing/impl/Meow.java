package com.example.AnimalApplication.behaviours.sing.impl;

import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public  class Meow implements SingableBehaviour {
    @Override
    public String sing() {
        return "Me ow";
    }
}
