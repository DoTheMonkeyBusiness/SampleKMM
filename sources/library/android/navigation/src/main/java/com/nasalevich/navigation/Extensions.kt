package com.nasalevich.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState

val NavHostController.currentRoute: String?
    @Composable
    get() {
        val navBackStackEntry by currentBackStackEntryAsState()
        return navBackStackEntry?.arguments?.getString(KEY_ROUTE)
    }