package com.cookingtime.controller;

import com.cookingtime.domain.Recipe;
import com.cookingtime.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Franco Sebastian
 * Rest controller to serve Recipes
 */
@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;


    @GetMapping
    public List<Recipe> findAll(){
        List<Recipe> list = new ArrayList<>();
        recipeService.findAll().forEach(list::add);
        return list;
    }
    @PostMapping
    public void create(Recipe recipe){
        recipeService.create(recipe);
    }


}
