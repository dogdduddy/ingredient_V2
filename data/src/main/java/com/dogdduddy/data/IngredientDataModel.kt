package com.dogdduddy.data

import com.dogdduddy.domain.Ingredient


data class IngredientDataModel(
    val category: String,
    val icon: String,
    val idx: Int,
    val name: String
)

fun IngredientDataModel.toIngredient() =
    com.dogdduddy.domain.Ingredient(
        category = this.category,
        icon = this.icon,
        idx = this.idx,
        name = this.name
    )

fun Ingredient.toIngredientDataModel() =
    IngredientDataModel(
        category = this.category,
        icon = this.icon,
        idx = this.idx,
        name = this.name
    )


