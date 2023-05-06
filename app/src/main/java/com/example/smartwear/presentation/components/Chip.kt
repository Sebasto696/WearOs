package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import androidx.wear.compose.material.*
import com.example.smartwear.R
import com.example.smartwear.presentation.components.Navigation.AppScreens

@Composable
fun ChipExample(navController: NavController){
    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        )
        {
            Chip(
                onClick = { /*TODO*/ },
                enabled = true,
                label = {
                        Text(text = "First Text", maxLines = 1, overflow = TextOverflow.Ellipsis)
                },
                secondaryLabel = {
                                 Text(text = "Second Text", maxLines = 1, overflow = TextOverflow.Ellipsis)
                },
                icon = {
                       Icon(painterResource(id = R.drawable.baseline_add_ic_call_24),
                           contentDescription = null,
                           modifier = Modifier.size(ChipDefaults.IconSize)
                               .wrapContentSize(align = Alignment.Center),
                       )
                },
                colors = ChipDefaults.imageBackgroundChipColors(
                    backgroundImagePainter = painterResource(id = R.drawable.grifith) ),
            )
        }
    Button(onClick = {navController.navigate(route = AppScreens.FiveScreen.route)}) {
        Text(text = "Siguiente")
    }
    }
    
