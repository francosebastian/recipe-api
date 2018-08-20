package com.cookingtime.repository;

import com.cookingtime.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Franco Sebastian
 * Repository for recipes
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
