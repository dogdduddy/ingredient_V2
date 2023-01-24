package com.dogdduddy.domain

import javax.inject.Inject

class UpdateIngredientUseCase @Inject constructor(
    private val ingredientRepository: IngredientRepository
) {
    fun updateIngredient(ingredient: Ingredient, name: String) {
        ingredientRepository.updateIngredient(
            Ingredient(
                category = ingredient.category,
                icon = ingredient.icon,
                idx = ingredient.idx,
                name = name
            ),
            ingredient.name
        )
    }
}