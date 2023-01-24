package com.dogdduddy.domain

import kotlinx.coroutines.flow.Flow

interface IngredientRepository {
    suspend fun getIngredient(): Flow<Ingredient>
    fun updateIngredient(ingredient: Ingredient, name: String)
}