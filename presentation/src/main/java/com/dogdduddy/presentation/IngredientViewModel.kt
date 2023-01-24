package com.dogdduddy.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogdduddy.domain.Ingredient
import com.dogdduddy.domain.UpdateIngredientUseCase
import com.dogdduddy.domain.getIngredientUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IngredientViewModel @Inject constructor(
    private val updateIngredientUseCase: UpdateIngredientUseCase,
    private val getIngredientUseCase: getIngredientUseCase
): ViewModel() {
    private val _ingredient = MutableLiveData<IngredientUIModel>()
    val ingredient: LiveData<IngredientUIModel> = _ingredient


    fun updateIngredient(name: String) =
        updateIngredientUseCase.updateIngredient(ingredient.value!!.toIngredient(), name)

    suspend fun getIngredient() {
        viewModelScope.launch {
            getIngredientUseCase.getIngredient().collect() {
                _ingredient.value = it.toIngredientUIModel()
            }
        }

    }
}