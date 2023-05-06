package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import com.example.smartwear.R
import com.example.smartwear.presentation.components.Navigation.AppScreens


@Composable

fun ButtonExample(navController: NavController){
val call = painterResource(com.google.android.gms.base.R.drawable.common_full_open_on_phone)
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {
            Icon(painter =  call,
                contentDescription = "phone")
        }
        Button(onClick = {navController.navigate(route = AppScreens.SecondScreen.route)}) {
            Text(text = "Siguiente")
        }

    }// End Column

}//End function