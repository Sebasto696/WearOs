package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.wear.compose.material.*
import com.example.smartwear.presentation.components.Navigation.AppScreens

@Composable

fun StepperExample(navController: NavController){
    var value by remember { mutableStateOf(5) }

    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Stepper(
            value = value,
            onValueChange = { value = it },
            valueProgression = 0..10,
            decreaseIcon = { Icon(StepperDefaults.Decrease, "Decrease") },
            increaseIcon = { Icon(StepperDefaults.Increase, "Increase")},

        ){ Text("Value : $value")}
        }
    Button(onClick = {navController.navigate(route = AppScreens.TenScreen.route)}) {
        Text(text = "Siguiente")
    }
    }
