package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.animals.Bird;
import com.example.AnimalApplication.behaviours.sing.impl.Cluck;
import com.example.AnimalApplication.behaviours.sing.impl.Cock;

public class Chicken extends Bird {
    public Chicken() {
        singableBehaviour = new Cluck();
    }
}
