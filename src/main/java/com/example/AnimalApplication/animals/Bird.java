package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.animals.Animal;
import com.example.AnimalApplication.behaviours.fly.impl.FlyableBehaviourImpl;
import com.example.AnimalApplication.behaviours.swim.SwimmableBehaviour;
import com.example.AnimalApplication.behaviours.swim.impl.NoSwimImpl;
import com.example.AnimalApplication.behaviours.walk.impl.WalkableImpl;

abstract class Bird extends Animal {
    public Bird() {
        flyableBehaviour = new FlyableBehaviourImpl();
        swimmableBehaviour = new NoSwimImpl();
        walkableBehaviour = new WalkableImpl();
    }
}