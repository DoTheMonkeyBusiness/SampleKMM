package com.nasalevich.core.featureProvider

import androidx.compose.ui.graphics.vector.ImageVector

interface BottomNavFeature : Feature {

    val icon: ImageVector

    val description: Int

    val label: Int
}