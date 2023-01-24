package com.dogdduddy.domain

import javax.inject.Inject

class getIngredientUseCase  @Inject constructor(
    private val ingredientRepository: IngredientRepository
) {
    suspend fun getIngredient() = ingredientRepository.getIngredient()
}