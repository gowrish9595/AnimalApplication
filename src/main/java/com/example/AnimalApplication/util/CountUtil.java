package com.example.AnimalApplication.util;

import com.example.AnimalApplication.animals.Animal;
import com.example.AnimalApplication.behaviours.fly.FlyableBehaviour;
import com.example.AnimalApplication.behaviours.fly.impl.FlyableBehaviourImpl;
import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;
import com.example.AnimalApplication.behaviours.sing.impl.NoSingable;
import com.example.AnimalApplication.behaviours.swim.SwimmableBehaviour;
import com.example.AnimalApplication.behaviours.swim.impl.SwimImpl;
import com.example.AnimalApplication.behaviours.walk.WalkableBehaviour;
import com.example.AnimalApplication.behaviours.walk.impl.WalkableImpl;

import java.util.List;
import java.util.function.Predicate;

public class CountUtil {
    public static Predicate<Animal> flyable = animal -> {
        FlyableBehaviour flyableBehaviour = animal.getFlyableBehaviour();
        return flyableBehaviour instanceof FlyableBehaviourImpl;
    };
    public static Predicate<Animal> singable = animal -> {
        SingableBehaviour singableBehaviour = animal.getSingableBehaviour();
        return !(singableBehaviour instanceof NoSingable);
    };
    public static Predicate<Animal> swimmable = animal -> {
        SwimmableBehaviour swimmableBehaviour = animal.getSwimmableBehaviour();
        return swimmableBehaviour instanceof SwimImpl;
    };
    public static Predicate<Animal> walkable = animal -> {
        WalkableBehaviour walkableBehaviour = animal.getWalkableBehaviour();
        return walkableBehaviour instanceof WalkableImpl;
    };

    public static long count(List<Animal> animals, Predicate<Animal> animalPredicate) {
        return animals.stream()
                .map(animalPredicate::test)
                .count();
    }


}
