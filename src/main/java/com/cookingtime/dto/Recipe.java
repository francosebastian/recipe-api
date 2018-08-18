package com.cookingtime.dto;

import lombok.Data;

import java.util.List;

@Data
public class Recipe {

    private String name;
    private List<Ingredient> ingredients;
    private List<Step> steps;

}
