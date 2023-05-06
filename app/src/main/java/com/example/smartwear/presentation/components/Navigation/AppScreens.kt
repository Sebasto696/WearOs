package com.example.smartwear.presentation.components.Navigation

sealed class AppScreens(val route : String){
    object FirstScreen : AppScreens(route = "ButtonExample")
    object SecondScreen : AppScreens(route = "ListExample")
    object ThirdScreen : AppScreens(route = "CardExample")
    object FourthScreen : AppScreens(route = "ChipExample")
    object FiveScreen : AppScreens(route = "CircularProgressIndicatorExample")
    object SixScreen : AppScreens(route = "DialogExample")
    object SevenScreen : AppScreens(route = "Inicial")
    object EightScreen : AppScreens(route = "SliderExample")
    object NineScreen : AppScreens(route = "StepperExample")
    object TenScreen : AppScreens(route = "ToogleChipsExample")
}
