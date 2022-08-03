package com.codeclan.example.mealservice.components;

import com.codeclan.example.mealservice.models.CuisineType;
import com.codeclan.example.mealservice.models.Meal;
import com.codeclan.example.mealservice.models.SubCuisineType;
import com.codeclan.example.mealservice.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MealRepository mealRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Meal crabLinguine = new Meal("Crab Linguine", CuisineType.ITALIAN, SubCuisineType.PASTA);
        mealRepository.save(crabLinguine);

        Meal pizza = new Meal("Pizza", CuisineType.ITALIAN, SubCuisineType.PIZZA);
        mealRepository.save(pizza);

        Meal ramen = new Meal("Ramen", CuisineType.JAPANESE, SubCuisineType.RAMEN);
        mealRepository.save(ramen);

        Meal fajitas = new Meal("Fajitas", CuisineType.MEXICAN, SubCuisineType.FAJITAS);
        mealRepository.save(fajitas);

        Meal beefBurger = new Meal("Burger", CuisineType.AMERICAN, SubCuisineType.BURGER);
        mealRepository.save(beefBurger);

        Meal chickenBurger = new Meal("Chicken Burger", CuisineType.AMERICAN, SubCuisineType.BURGER);
        mealRepository.save(chickenBurger);

        Meal sushi = new Meal("Sushi", CuisineType.JAPANESE, SubCuisineType.SUSHI);
        mealRepository.save(sushi);
    }

}
