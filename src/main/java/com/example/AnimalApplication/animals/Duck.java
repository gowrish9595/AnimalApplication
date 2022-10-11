package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.animals.Bird;
import com.example.AnimalApplication.behaviours.sing.impl.Quack;
import com.example.AnimalApplication.behaviours.swim.impl.SwimImpl;

public class Duck extends Bird {
    public Duck() {
        singableBehaviour = new Quack();
        swimmableBehaviour = new SwimImpl();
    }
}
