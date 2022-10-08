package com.example.AnimalApplication;

abstract class Bird extends Animal {

    Singable singableBehaviour;
    public String fly() {
        return "I am flying";
    }

    public String sing() {
        return singableBehaviour.sing();
    }


}