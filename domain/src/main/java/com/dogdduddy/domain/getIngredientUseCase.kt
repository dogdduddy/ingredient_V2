package com.dogdduddy.domain

import javax.inject.Inject

class getIngredientUseCase  @Inject constructor(
    private val ingredientRepository: IngredientRepository
) {
    fun getIngredient() = ingredientRepository.getIngredient()
}