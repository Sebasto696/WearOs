package com.example.smartwear.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.wear.compose.material.*
import androidx.wear.compose.material.dialog.Alert
import androidx.wear.compose.material.dialog.Dialog
import com.example.smartwear.R
import com.example.smartwear.presentation.components.Navigation.AppScreens

@Composable

fun DialogExample(navController: NavController){
    var showDialog by remember { mutableStateOf(false)}
    val scrollState = rememberScalingLazyListState()
    val plane : Int = R.drawable.grifith
    val call : Int = R.drawable.baseline_add_ic_call_24

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { showDialog = true },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
            ) {
            Icon(painter = painterResource(id = plane), contentDescription = "Elsocio",
            modifier = Modifier.size(44.dp))
        }//End button
        Dialog(
            showDialog = showDialog,
            onDismissRequest = { showDialog = false},
            scrollState = scrollState
        ) {
            Alert(scrollState = scrollState,
            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                contentPadding = PaddingValues(start = 10.dp, end = 10.dp, top = 24.dp, bottom = 52.dp),
                icon = {
                    Icon(painter = painterResource(id = call),
                        contentDescription = "Call",
                        modifier = Modifier
                            .size(24.dp)
                            .wrapContentSize(align = Alignment.Center)
                            .clickable { showDialog = false },
                        )
                },
                title = { Text(text = "Linea de ejemplo...", textAlign = TextAlign.Center)},
                message = { Text(text = "Mensaje interno del dialog", textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.body2) }
                ){
                item{
                    Chip(
                        label = { Text("Primary")},
                        onClick = {showDialog = false},
                        colors = ChipDefaults.primaryChipColors()
                    )
                }
                item {
                    Chip(
                        label = { Text("Secondary")},
                        onClick = {showDialog = false},
                        colors = ChipDefaults.primaryChipColors()
                    )
                }
            }
        }
        Button(onClick = {navController.navigate(route = AppScreens.EightScreen.route)}) {
            Text(text = "Siguiente")
        }
    }


}

