package com.nasalevich.episodespage.feature

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nasalevich.core.featureProvider.BottomNavFeature
import com.nasalevich.episodespage.presentation.ui.EpisodesScreen
import com.nasalevich.kmm.appResources.MR
import dev.icerock.moko.resources.StringResource

class FeatureEpisodes : BottomNavFeature {

    override val icon: ImageVector
        get() = Icons.Rounded.AccountBox

    override val description: Int = MR.strings.episodes_bottom_label.resourceId

    override val label: Int = MR.strings.episodes_bottom_label.resourceId

    override val route: String
        get() = "Episodes"

    override fun composeLayout(
        builder: NavGraphBuilder,
        navController: NavHostController
    ) = builder.composable(route) {
        EpisodesScreen()
    }
}