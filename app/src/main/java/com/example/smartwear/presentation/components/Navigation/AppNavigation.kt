package com.example.smartwear.presentation.components.Navigation

import androidx.compose.runtime.Composable
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.example.smartwear.presentation.components.*

@Composable

fun AppNavigation(){
    val navController = rememberSwipeDismissableNavController()
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = AppScreens.SevenScreen.route
        ){
        composable(route = AppScreens.FirstScreen.route){ ButtonExample(navController) }
        composable(route = AppScreens.SecondScreen.route){ ListExample(navController) }
        composable(route = AppScreens.ThirdScreen.route){ CardExample(navController)}
        composable(route = AppScreens.FourthScreen.route){ ChipExample(navController) }
        composable(route = AppScreens.FiveScreen.route){ CircularProgressIndicatorExample(navController) }
        composable(route = AppScreens.SixScreen.route){ DialogExample(navController) }
        composable(route = AppScreens.SevenScreen.route){ Inicial(navController) }
        composable(route = AppScreens.EightScreen.route){ SliderExample(navController) }
        composable(route = AppScreens.NineScreen.route){ StepperExample(navController) }
        composable(route = AppScreens.TenScreen.route){ ToogleChipsExample(navController) }
    }
}