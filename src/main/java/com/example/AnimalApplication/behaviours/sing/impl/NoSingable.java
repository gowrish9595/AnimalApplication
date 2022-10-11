package com.example.AnimalApplication.behaviours.sing.impl;

import com.example.AnimalApplication.behaviours.sing.SingableBehaviour;

public class NoSingable implements SingableBehaviour {
    @Override
    public String sing() {
        return "no sing";
    }
}
