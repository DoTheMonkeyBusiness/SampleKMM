package com.nasalevich.locationspage.feature

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nasalevich.core.featureProvider.BottomNavFeature
import com.nasalevich.kmm.appResources.MR
import com.nasalevich.locationspage.presentation.ui.LocationsScreen
import dev.icerock.moko.resources.StringResource

class FeatureLocations : BottomNavFeature {

    override val icon: ImageVector
        get() = Icons.Rounded.Clear

    override val description: Int = MR.strings.locations_bottom_label.resourceId

    override val label: Int = MR.strings.locations_bottom_label.resourceId

    override val route: String
        get() = "Locations"

    override fun composeLayout(
        builder: NavGraphBuilder,
        navController: NavHostController
    ) = builder.composable(route) {
        LocationsScreen()
    }
}