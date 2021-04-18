package com.nasalevich.mainpage.presentation.ui

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.nasalevich.core.featureProvider.BottomNavFeature
import com.nasalevich.navigation.currentRoute
import com.nasalevich.navigation.navigator.navigateSingleTop

@Composable
fun AppBottomNavigation(
    navController: NavHostController,
    items: List<BottomNavFeature>
) {
    BottomNavigation {
        val currentRoute = navController.currentRoute
        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(screen.icon, stringResource(id = screen.description)) },
                label = { Text(stringResource(id = screen.label)) },
                selected = currentRoute == screen.route,
                onClick = {
                    if (currentRoute != screen.route) {
                        navController.navigateSingleTop(screen.route)
                    }
                }
            )
        }
    }
}