package com.dogdduddy.data

import kotlinx.coroutines.flow.Flow
import com.dogdduddy.domain.Ingredient

interface IngredientDataSource {
    suspend fun getIngredient(): Flow<Ingredient>
    fun updateIngredient(ingredient: Ingredient, name: String)
}