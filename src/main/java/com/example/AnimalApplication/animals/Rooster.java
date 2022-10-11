package com.example.AnimalApplication.animals;


import com.example.AnimalApplication.animals.Chicken;
import com.example.AnimalApplication.behaviours.sing.impl.Cock;

public class Rooster extends Animal {
    public Rooster() {
        singableBehaviour = new Cock();
    }
}
