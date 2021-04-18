package com.nasalevich.characterspage.feature

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nasalevich.characterspage.presentation.ui.CharactersScreen
import com.nasalevich.core.featureProvider.BottomNavFeature
import com.nasalevich.kmm.appResources.MR

class FeatureCharacters : BottomNavFeature {

    override val icon: ImageVector
        get() = Icons.Rounded.AccountBox

    override val description: Int = MR.strings.characters_bottom_label.resourceId

    override val label: Int = MR.strings.characters_bottom_label.resourceId

    override val route: String
        get() = "Characters"

    override fun composeLayout(
        builder: NavGraphBuilder,
        navController: NavHostController
    ) = builder.composable(route) {
        CharactersScreen()
    }
}