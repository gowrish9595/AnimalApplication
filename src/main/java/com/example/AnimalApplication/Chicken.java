package com.example.AnimalApplication;

public class Chicken extends Bird {
    @Override
    public String fly() {
        return "I cant fly";
    }

    public String sing() {
        return "Cluck, cluck";
    }
}
