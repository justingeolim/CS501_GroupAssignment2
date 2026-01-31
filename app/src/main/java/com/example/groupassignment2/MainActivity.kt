package com.example.groupassignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.groupassignment2.ui.theme.GroupAssignment2Theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Slider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.mutableFloatStateOf

import androidx.compose.runtime.remember
import androidx.compose.runtime.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GroupAssignment2Theme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        DemoScreen(modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }


@Composable
fun DemoScreen(modifier: Modifier = Modifier) {

    var sliderPosition by remember { mutableFloatStateOf(0.5f) }

    //API reference: https://developer.android.com/reference/android/graphics/Color
    val backgroundColor = Color(
        //opaque-ness. Can change later for lighter color
        alpha = 1f,

        red = sliderPosition,
        green = 0.5f,
        blue = 1f - sliderPosition
    )

    //Reference from: https://developer.android.com/develop/ui/compose/modifiers
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
            //
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Background Color Slider",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(40.dp))

        ColorSlider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Value: ${"%.2f".format(sliderPosition)}")
    }
}

@Composable
fun ColorSlider(
    value: Float,
    onValueChange: (Float) -> Unit
) {
    Slider(
        value = value,
        onValueChange = onValueChange,
        valueRange = 0f..1f
    )
}

@Preview(showBackground = true)
@Composable
fun DemoScreenPreview() {
    GroupAssignment2Theme {
        DemoScreen()
    }
}