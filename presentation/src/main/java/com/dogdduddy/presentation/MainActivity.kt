package com.dogdduddy.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val ingredientViewModel: IngredientViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testText = findViewById<TextView>(R.id.textView)
        ingredientViewModel.ingredient.observe(this) {
            testText.text = it.name
        }
        CoroutineScope(Dispatchers.Main).launch {
            ingredientViewModel.getIngredient()
        }

        val testEdit = findViewById<EditText>(R.id.editText)
        val testBtn = findViewById<Button>(R.id.button)
        testBtn.setOnClickListener {
            Log.d("TestT", "1 : ${testEdit.text}")
            ingredientViewModel.updateIngredient(testEdit.text.toString())
        }

        val testBtn2 = findViewById<Button>(R.id.button2)
        testBtn2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


        /*
        val testBtn2 = findViewById<Button>(R.id.button2)
        testBtn2.setOnClickListener {
            ingredientViewModel.testClick()
        }

         */
    }
}