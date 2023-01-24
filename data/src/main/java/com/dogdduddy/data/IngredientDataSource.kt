package com.dogdduddy.data

import kotlinx.coroutines.flow.Flow
import com.dogdduddy.domain.Ingredient

interface IngredientDataSource {
    fun getIngredient(): Flow<Ingredient>
    fun updateIngredient(ingredient: Ingredient)
}