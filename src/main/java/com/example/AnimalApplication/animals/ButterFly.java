package com.example.AnimalApplication.animals;

import com.example.AnimalApplication.behaviours.fly.impl.FlyableBehaviourImpl;
import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;
import com.example.AnimalApplication.behaviours.sing.impl.NoSingable;

public class ButterFly extends Animal {
    public ButterFly() {
        flyableBehaviour = new FlyableBehaviourImpl();
        singableBehaviour = new NoSingable();
    }

    public void changeFlyable(FlyableBehaviourImpl flyableBehaviour) {
        super.flyableBehaviour = flyableBehaviour;
    }

    public void changeSingable(SingableBehaviour singableBehaviour) {
        super.singableBehaviour = singableBehaviour;
    }
}
