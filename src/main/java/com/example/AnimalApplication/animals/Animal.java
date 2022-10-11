package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.behaviours.fly.FlyableBehaviour;
import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;
import com.example.AnimalApplication.behaviours.swim.SwimmableBehaviour;
import com.example.AnimalApplication.behaviours.walk.WalkableBehaviour;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Animal {
    WalkableBehaviour walkableBehaviour;
    SingableBehaviour singableBehaviour;
    SwimmableBehaviour swimmableBehaviour;
    FlyableBehaviour flyableBehaviour;
}
