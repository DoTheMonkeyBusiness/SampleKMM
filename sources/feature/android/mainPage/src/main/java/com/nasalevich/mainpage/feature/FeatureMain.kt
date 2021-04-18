package com.nasalevich.mainpage.feature

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nasalevich.core.featureProvider.Feature
import com.nasalevich.mainpage.presentation.ui.MainScreen

class FeatureMain : Feature {

    override val route: String = "MainScreen"

    override fun composeLayout(
        builder: NavGraphBuilder,
        navController: NavHostController,
    ) = builder.composable(route) {
        MainScreen()
    }
}