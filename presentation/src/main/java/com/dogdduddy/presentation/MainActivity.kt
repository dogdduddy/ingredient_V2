package com.dogdduddy.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val ingredientViewModel: IngredientViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testText = findViewById<TextView>(R.id.textView)
        ingredientViewModel.ingredient.observe(this) {
            testText.text = it.name
        }
        ingredientViewModel.getIngredient()

        val testEdit = findViewById<EditText>(R.id.editText)
        val testBtn = findViewById<Button>(R.id.button)
        testBtn.setOnClickListener {
            Log.d("TestT", "1 : ${testEdit.text}")
            ingredientViewModel.updateIngredient(testEdit.text.toString())
        }
    }
}