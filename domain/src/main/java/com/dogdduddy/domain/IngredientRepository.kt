package com.dogdduddy.domain

import kotlinx.coroutines.flow.Flow

interface IngredientRepository {
    fun getIngredient(): Flow<Ingredient>
    fun updateIngredient(ingredient: Ingredient)
}