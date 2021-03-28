package com.nasalevich.core.featureProvider

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

interface Feature {

    val route: String

    fun composeLayout(builder: NavGraphBuilder, navController: NavHostController)
}