package com.example.AnimalApplication.controller;

import com.example.AnimalApplication.animals.Animal;
import com.example.AnimalApplication.animals.Duck;
import com.example.AnimalApplication.animals.Parrot;
import com.example.AnimalApplication.animals.Rooster;
import com.example.AnimalApplication.behaviours.sing.impl.Woof;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/v1/")
public class AnimalController {

    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        log.info("Request Received to get all animals");
        List<Animal> animals = new LinkedList<>();
        animals.add(new Duck());
        animals.add(new Rooster());
        animals.add(new Parrot(new Woof()));
        return animals;
    }
}
