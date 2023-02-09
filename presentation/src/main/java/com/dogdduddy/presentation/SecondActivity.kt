package com.dogdduddy.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    private val ingredientViewModel: IngredientViewModel2 by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val testText = findViewById<TextView>(R.id.textView)
        lifecycleScope.launchWhenStarted {
            ingredientViewModel.ingredient.collectLatest {
                testText.text = it.name
            }
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
    }
}