package com.nasalevich.kmm.androidApp

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nasalevich.core.featureProvider.Feature

class FeatureMain : Feature {

    override val route: String = "MainScreen"

    override fun composeLayout(
        builder: NavGraphBuilder,
        navController: NavHostController
    ) = builder.composable(route) {
        Column {
            Text(text = "abc")
        }
    }
}