package com.cookingtime.service;

import com.cookingtime.dto.Recipe;

public interface RecipeService {

  Iterable<Recipe> findAll();

}
