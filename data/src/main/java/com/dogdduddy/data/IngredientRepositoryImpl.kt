package com.dogdduddy.data

import android.util.Log
import com.dogdduddy.domain.Ingredient
import com.dogdduddy.domain.IngredientRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class IngredientRepositoryImpl @Inject constructor(
    private val ingredientDataSourceImpl: IngredientDataSourceImpl
) : IngredientRepository {
    override suspend fun getIngredient(): Flow<Ingredient> {
        return ingredientDataSourceImpl.getIngredient()
    }

    override fun updateIngredient(ingredient: com.dogdduddy.domain.Ingredient, name: String) {
        ingredientDataSourceImpl.updateIngredient(ingredient, name)
    }
}
