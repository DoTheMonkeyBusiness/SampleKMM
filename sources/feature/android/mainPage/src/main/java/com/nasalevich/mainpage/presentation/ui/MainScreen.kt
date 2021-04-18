package com.nasalevich.mainpage.presentation.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.nasalevich.core.featureProvider.FeatureProvider
import org.koin.androidx.compose.get

@Composable
fun MainScreen(
    featureProvider: FeatureProvider = get()
) {
    val navController = rememberNavController()
    val bottomNavigationItems = listOf(
        featureProvider.featureCharacters,
        featureProvider.featureEpisodes,
        featureProvider.featureLocations,
    )

    Scaffold(
        bottomBar = {
            AppBottomNavigation(navController, bottomNavigationItems)
        },
    ) {
        MainScreenNavigationConfigurations(
            navController = navController,
            featureProvider = featureProvider
        )
    }
}

@Composable
private fun MainScreenNavigationConfigurations(
    navController: NavHostController,
    featureProvider: FeatureProvider,
) {
    NavHost(
        navController = navController,
        startDestination = featureProvider.featureCharacters.route,
    ) {
        featureProvider.featureCharacters.composeLayout(this, navController)
        featureProvider.featureEpisodes.composeLayout(this, navController)
        featureProvider.featureLocations.composeLayout(this, navController)
    }
}