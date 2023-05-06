package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.*
import com.example.smartwear.presentation.components.Navigation.AppScreens

@Composable
fun ListExample(navController: NavController){
    val listState = rememberScalingLazyListState()
    val list : List<String> =
        listOf("Maras", "Antep", "Izimir", "Instanbul", "Ankara", "Mardin", "Rize")

    Column(Modifier.fillMaxSize()) {

        ScalingLazyColumn(state = listState){
            itemsIndexed(items = list){
                index, item ->

                Card(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    contentColor = Color.Black,
                    shape = RoundedCornerShape(20.dp),
                    ) {

                    Column (
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                            ) {
                            Text(item, textAlign = TextAlign.Center, color = Color.Blue)
                    }
                Spacer(modifier = Modifier.height(8.dp))
                }
                Button(onClick = {navController.navigate(route = AppScreens.ThirdScreen.route)}) {
                    Text(text = "Siguiente")
                }
            }
        }
    }
}