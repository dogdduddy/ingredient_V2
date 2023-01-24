package com.dogdduddy.presentation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.dogdduddy.domain.Ingredient

@Parcelize
data class IngredientUIModel(
    val category: String,
    val icon: String,
    val idx: Int,
    val name: String
) : Parcelable

fun IngredientUIModel.toIngredient() =
    Ingredient(
        category = this.category,
        icon = this.icon,
        idx = this.idx,
        name = this.name
    )

fun Ingredient.toIngredientUIModel() =
    IngredientUIModel(
        category = this.category,
        icon = this.icon,
        idx = this.idx,
        name = this.name
    )
