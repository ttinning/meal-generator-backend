package com.codeclan.example.mealservice.controllers;

import com.codeclan.example.mealservice.models.Meal;
import com.codeclan.example.mealservice.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class MealController {

    @Autowired
    MealRepository mealRepository;

    @GetMapping(value = "/meals")
    public ResponseEntity<List<Meal>> getAllMeals() {
        return new ResponseEntity<>(mealRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "meals/{id}")
    public ResponseEntity getMealById(@PathVariable long id) {
        return new ResponseEntity(mealRepository.findById(id), HttpStatus.OK);
    }
}
