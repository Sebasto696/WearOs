package com.example.smartwear.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Card
import androidx.wear.compose.material.Text
import com.example.smartwear.R
import com.example.smartwear.presentation.components.Navigation.AppScreens

@Composable

fun CardExample(navController: NavController){
    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Card(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            contentColor = Color.Yellow,
            shape = RoundedCornerShape(20.dp),
            ) {
            Column (
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Image(painterResource(R.drawable.grifith), contentDescription = "Grifith")
                Text("Jetpatck Compose", textAlign = TextAlign.Center)
            }
            Button(onClick = {navController.navigate(route = AppScreens.FourthScreen.route)}) {
                Text(text = "Siguiente")
            }
        }


    }
}