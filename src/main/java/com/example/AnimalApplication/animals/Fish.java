package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.behaviours.fly.impl.NonFlyableBehaviourImpl;
import com.example.AnimalApplication.behaviours.sing.impl.NoSingable;
import com.example.AnimalApplication.behaviours.swim.impl.SwimImpl;
import com.example.AnimalApplication.behaviours.walk.impl.NonWalkableImpl;

public abstract class Fish extends Animal {
    String size;
    String color;

    public Fish() {
        singableBehaviour = new NoSingable();
        walkableBehaviour = new NonWalkableImpl();
        swimmableBehaviour = new SwimImpl();
        flyableBehaviour = new NonFlyableBehaviourImpl();
    }
}
