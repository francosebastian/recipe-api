package com.cookingtime.dto;

import lombok.Data;


/**
 * Dto class for ingredient
 */
@Data
public class Ingredient {

    private String name;

    private Quantity quantity;

    private MeasureType measureType;

}
