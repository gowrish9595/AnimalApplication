package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.animals.Bird;
import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;

public class Parrot extends Bird {
    public Parrot(SingableBehaviour singable) {
        super.singableBehaviour = singable;
    }
}
