package com.dogdduddy.data

import com.dogdduddy.domain.IngredientRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun provideTestRepository(ingredientRepositoryImpl: IngredientRepositoryImpl): IngredientRepository
}