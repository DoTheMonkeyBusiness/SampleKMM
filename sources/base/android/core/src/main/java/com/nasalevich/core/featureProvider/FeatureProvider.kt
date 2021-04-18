package com.nasalevich.core.featureProvider

interface FeatureProvider {

    val featureMain: Feature

    val featureCharacters: BottomNavFeature

    val featureEpisodes: BottomNavFeature

    val featureLocations: BottomNavFeature
}