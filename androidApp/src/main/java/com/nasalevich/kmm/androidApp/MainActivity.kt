package com.nasalevich.kmm.androidApp

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.nasalevich.kmm.shared.Greeting

fun greet(context: Context): String {
    return Greeting().greeting().toString(context = context)
}

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Text(text = greet(this))
        }
    }
}
