package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Text
import com.example.smartwear.presentation.components.Navigation.AppScreens
import com.example.smartwear.presentation.theme.SmartWearTheme

@Composable
fun Inicial(navController: NavController){
    SmartWearTheme {
        Column( Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
            Text(text = "First example of Wear OS",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                )
        }// End column
        Button(onClick = {navController.navigate(route = AppScreens.FirstScreen.route)}) {
            Text(text = "Siguiente")
        }
    }//End theme
}//End function