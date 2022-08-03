package com.codeclan.example.mealservice.controllers;

import com.codeclan.example.mealservice.models.Meal;
import com.codeclan.example.mealservice.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;
import java.util.NoSuchElementException;

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

    @PostMapping(value = "/meals")
    public ResponseEntity createMeal(@RequestBody Meal meal) {
        mealRepository.save(meal);
        return new ResponseEntity(meal, HttpStatus.CREATED);
    }

    @PutMapping(value = "/meals/{id}")
    public ResponseEntity updateMeal(@PathVariable Long id, @RequestBody Meal meal) {
        try {
            Meal mealToUpdate = mealRepository.findById(id).get();
            mealToUpdate.setName(meal.getName());
            mealToUpdate.setCuisineType(meal.getCuisineType());
            mealToUpdate.setSubCuisineType(meal.getSubCuisineType());

            mealRepository.save(mealToUpdate);
            return new ResponseEntity(mealToUpdate, HttpStatus.OK);
        }
        catch (NoSuchElementException ex) {
            return new ResponseEntity("Meal Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/meals/{id}")
    public ResponseEntity deleteMeal(@PathVariable Long id) {
        mealRepository.deleteById(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
