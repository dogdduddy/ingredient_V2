package com.dogdduddy.data

import android.util.Log
import com.dogdduddy.domain.Ingredient
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

class IngredientDataSourceImpl @Inject constructor(
    private val db: FirebaseFirestore
): IngredientDataSource {
    override suspend fun getIngredient(): Flow<com.dogdduddy.domain.Ingredient> = callbackFlow {
        val registration = db.collection("Test")
            .whereEqualTo("ingredientidx", 0)
            .addSnapshotListener { snapshot, _ ->
                kotlin.runCatching { snapshot?.toObjects(IngredientDataModel::class.java) }
                    .onSuccess { trySend(it!!.get(0)!!.toIngredient()) }
                    .onFailure { Log.d("TestT", "E : $it") }
            }
        awaitClose { registration.remove() }
    }
    override fun updateIngredient(ingredient: Ingredient, name: String) {
        db.collection("Test")
            .whereEqualTo("ingredientidx", 0)
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    Log.d("TestT", "${document.data} => ${ingredient.name}")
                    db.collection("Test").document(document.id).update("ingredientname", ingredient.name)
                }
            }
    }
}