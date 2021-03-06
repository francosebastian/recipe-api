package com.cookingtime.service;

import com.cookingtime.domain.Recipe;
import com.cookingtime.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Franco Sebastian
 * Recipe service class implementation
 */
@Service
public class RecipeServiceImpl implements RecipeService {


    @Autowired
    RecipeRepository recipeRepository;

    @Override
    public Iterable<Recipe> findAll(){
        return recipeRepository.findAll();
    }

    @Override
    public Recipe create(Recipe recipe) {
        return recipeRepository.insert(recipe);
    }
}
