package com.codeclan.example.mealservice.models;

import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cuisine_type")
    @Enumerated(value = EnumType.STRING)
    private CuisineType cuisineType;

    @Column(name = "sub_cuisine_type")
    @Enumerated(value = EnumType.STRING)
    private SubCuisineType subCuisineType;

    public Meal(String name, CuisineType cuisineType, SubCuisineType subCuisineType) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.subCuisineType = subCuisineType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public SubCuisineType getSubCuisineType() {
        return subCuisineType;
    }

    public void setSubCuisineType(SubCuisineType subCuisineType) {
        this.subCuisineType = subCuisineType;
    }
}
