package com.nasalevich.theaming

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.nasalevich.kmm.appResources.MR

private val lightColors = lightColors(
    primary = Color(MR.colors.colorPrimaryLight.color.rgba),
    primaryVariant = Color(MR.colors.colorPrimaryVariantLight.color.rgba),
    secondary = Color(MR.colors.colorSecondaryLight.color.rgba),
    background = Color(MR.colors.colorBackgroundLight.color.rgba),
    surface = Color(MR.colors.colorSurfaceLight.color.rgba),
)

private val darkColors = darkColors(
    primary = Color(MR.colors.colorPrimaryDark.color.rgba),
    primaryVariant = Color(MR.colors.colorPrimaryVariantDark.color.rgba),
    secondary = Color(MR.colors.colorSecondaryDark.color.rgba),
    background = Color(MR.colors.colorBackgroundDark.color.rgba),
    surface = Color(MR.colors.colorSurfaceDark.color.rgba),
)

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        darkColors
    } else {
        lightColors
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}