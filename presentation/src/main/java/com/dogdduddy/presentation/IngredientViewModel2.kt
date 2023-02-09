package com.dogdduddy.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogdduddy.domain.UpdateIngredientUseCase
import com.dogdduddy.domain.getIngredientUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IngredientViewModel2 @Inject constructor(
    private val updateIngredientUseCase: UpdateIngredientUseCase,
    private val getIngredientUseCase: getIngredientUseCase
): ViewModel() {
    private val _ingredient = MutableStateFlow<IngredientUIModel>(IngredientUIModel("", "", 0, ""))
    val ingredient: StateFlow<IngredientUIModel> = _ingredient.asStateFlow()


    fun updateIngredient(name: String) =
        updateIngredientUseCase.updateIngredient(ingredient.value!!.toIngredient(), name)

    suspend fun getIngredient() {
        viewModelScope.launch {
            getIngredientUseCase.getIngredient().collect() {
                _ingredient.emit(it.toIngredientUIModel())
                //_ingredient.value = it.toIngredientUIModel()
            }
        }

    }
}