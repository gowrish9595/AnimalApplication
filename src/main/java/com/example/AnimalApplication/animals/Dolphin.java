package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.behaviours.swim.impl.SwimImpl;

public class Dolphin extends Animal{
    public Dolphin() {
        swimmableBehaviour = new SwimImpl();
    }
}
