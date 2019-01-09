package com.cookingtime.service;

import com.cookingtime.domain.Recipe;

/**
 * @author Franco Sebastian
 * Recipe service interface
 */
public interface RecipeService {

  Iterable<Recipe> findAll();

  Recipe create(Recipe recipe);
}
