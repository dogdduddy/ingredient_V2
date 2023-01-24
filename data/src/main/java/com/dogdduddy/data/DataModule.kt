package com.dogdduddy.data

import com.dogdduddy.domain.IngredientRepository
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun provideIngredientRepository(ingredientRepositoryImpl: IngredientRepositoryImpl): IngredientRepository

}