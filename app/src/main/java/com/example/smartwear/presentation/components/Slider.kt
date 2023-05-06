package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.InlineSlider
import androidx.wear.compose.material.InlineSliderDefaults

@Composable

fun SliderExample(navController: NavController){
    var value by remember {
        mutableStateOf(4.5f)
    }

    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        InlineSlider(
            value = value,
            onValueChange = { value = it },
            valueRange = 3f..6f,
            steps = 5,
            segmented = true,
            increaseIcon = { Icon(InlineSliderDefaults.Increase, contentDescription = "Aumentar")},
            decreaseIcon = { Icon(InlineSliderDefaults.Decrease, contentDescription = "Reducir") })
    }
}