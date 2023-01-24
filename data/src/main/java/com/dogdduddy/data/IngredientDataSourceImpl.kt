package com.dogdduddy.data

import com.dogdduddy.domain.Ingredient
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class IngredientDataSourceImpl @Inject constructor(): IngredientDataSource {
    override fun getIngredient(): Flow<com.dogdduddy.domain.Ingredient> {
        TODO("Not yet implemented")
    }

    override fun updateIngredient(ingredient: Ingredient) {
        TODO("Not yet implemented")
    }
}