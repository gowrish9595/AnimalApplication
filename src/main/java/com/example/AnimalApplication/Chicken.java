package com.example.AnimalApplication;

public class Chicken extends Bird {
    public Chicken() {
        singableBehaviour = new Cock();
    }

    @Override
    public String fly() {
        return "I cant fly";
    }
}
