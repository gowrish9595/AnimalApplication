package com.example.AnimalApplication;


public class Rooster {

    private final MyChicken chicken = new MyChicken();

    public String walk() {
       return chicken.walk();
    }
    public String sing() {
        return chicken.sing();
    }

    private static class MyChicken extends Chicken {
        @Override
        public String sing() {
            return "Cock-a-doodle-doo";
        }
    }
}
