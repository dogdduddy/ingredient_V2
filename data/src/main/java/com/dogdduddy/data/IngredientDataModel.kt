package com.dogdduddy.data

import com.dogdduddy.domain.Ingredient


data class IngredientDataModel(
    val ingredientcategory: String = "",
    val ingredienticon: String = "",
    val ingredientidx: Int = 0,
    val ingredientname: String = ""
)

fun IngredientDataModel.toIngredient() =
    com.dogdduddy.domain.Ingredient(
        category = this.ingredientcategory,
        icon = this.ingredienticon,
        idx = this.ingredientidx,
        name = this.ingredientname
    )

fun Ingredient.toIngredientDataModel() =
    IngredientDataModel(
        ingredientcategory = this.category,
        ingredienticon = this.icon,
        ingredientidx = this.idx,
        ingredientname = this.name
    )


