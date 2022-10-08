package com.example.AnimalApplication;

public class Duck extends Bird {
    @Override
    public String sing() {
        return "Quack , quack";
    }

    public String swim() {
        return "Swim";
    }
}
