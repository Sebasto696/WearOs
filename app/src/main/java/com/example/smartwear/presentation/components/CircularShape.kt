package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.CircularProgressIndicator
import androidx.wear.compose.material.Text
import com.example.smartwear.presentation.components.Navigation.AppScreens

@Composable

fun CircularProgressIndicatorExample(navController: NavController){
    CircularProgressIndicator(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 1.dp),
        startAngle = 295.5f,
        endAngle = 245.5f,
        progress = 0.3f,
        strokeWidth = 5.dp,
        indicatorColor = Color.Green,
        trackColor = Color.LightGray
    )
    Button(onClick = {navController.navigate(route = AppScreens.SixScreen.route)}) {
        Text(text = "Siguiente")
    }
}