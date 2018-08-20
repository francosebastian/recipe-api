package com.cookingtime.domain;

import lombok.Data;

/**
 * @author Franco Sebastian
 * Domain class for ingredient
 */
@Data
public class Ingredient {

    private String name;

    private Double quantity;

    private MeasureType measureType;

}
