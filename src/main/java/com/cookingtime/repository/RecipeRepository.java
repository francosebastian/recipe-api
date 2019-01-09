package com.cookingtime.repository;

import com.cookingtime.domain.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Franco Sebastian
 * Repository for recipes
 */
@Repository
public interface RecipeRepository extends MongoRepository<Recipe, Long> {
    
}
