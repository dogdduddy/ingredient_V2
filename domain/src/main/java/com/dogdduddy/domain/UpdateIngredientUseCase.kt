package com.dogdduddy.domain

import javax.inject.Inject

class UpdateIngredientUseCase @Inject constructor(
    private val ingredientRepository: IngredientRepository
) {
    fun updateIngredient(ingredient: Ingredient, name: String) {
        ingredientRepository.updateIngredient(
            Ingredient(
                ingredient.category,
                ingredient.icon,
                ingredient.idx,
                name
            )
        )
    }
}