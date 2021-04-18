package com.nasalevich.navigation.navigator

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

fun NavHostController.navigateSingleTop(route: String) {
    navigate(route){
        popUpTo = graph.startDestination
        launchSingleTop = true
    }
}