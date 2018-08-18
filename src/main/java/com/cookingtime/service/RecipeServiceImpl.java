package com.cookingtime.service;

import com.cookingtime.dto.Recipe;
import com.cookingtime.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {


    @Autowired
    RecipeRepository recipeRepository;

    public Iterable<Recipe> findAll(){
        return recipeRepository.findAll();
    }
}
