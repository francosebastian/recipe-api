package com.cookingtime.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Franco Sebastian
 * Domain class for recipes
 */
@Data
@Document
public class Recipe {

    private String name;
    private List<Ingredient> ingredients;
    private List<Step> steps;
    private String imgUrl;

}
