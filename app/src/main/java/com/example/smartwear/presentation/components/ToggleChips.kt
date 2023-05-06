package com.example.smartwear.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import androidx.wear.compose.material.*
import com.example.smartwear.R

@Composable
fun ToogleChipsExample(navController: NavController){
    var checked by remember{ mutableStateOf(false) }
    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        ToggleChip(
            checked = checked,
            onCheckedChange = {checked = it},
            label = {
                Text(text = "First Text", maxLines = 1, overflow = TextOverflow.Ellipsis)
            },
            secondaryLabel = {
                Text(text = "Second Text", maxLines = 1, overflow = TextOverflow.Ellipsis)
            },
            toggleControl = {
                Switch(
                    checked = checked,
                    enabled = true,
                    modifier = Modifier.semantics {
                        this.contentDescription = if(checked)"On" else "Of"
                    }
                )
            },
            appIcon =  {
                Icon(painterResource(id = R.drawable.baseline_add_ic_call_24), contentDescription =null )
            },
            enabled = true
        )
    }
}