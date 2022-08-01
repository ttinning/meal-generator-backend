package com.codeclan.example.mealservice.repositories;

import com.codeclan.example.mealservice.models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
