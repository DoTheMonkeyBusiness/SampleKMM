package com.nasalevich.kmm.androidApp.feature

import com.nasalevich.characterspage.feature.FeatureCharacters
import com.nasalevich.core.featureProvider.BottomNavFeature
import com.nasalevich.core.featureProvider.Feature
import com.nasalevich.core.featureProvider.FeatureProvider
import com.nasalevich.episodespage.feature.FeatureEpisodes
import com.nasalevich.locationspage.feature.FeatureLocations
import com.nasalevich.mainpage.feature.FeatureMain

class FeatureProviderImpl : FeatureProvider {

    override val featureMain: Feature = FeatureMain()

    override val featureCharacters: BottomNavFeature = FeatureCharacters()

    override val featureEpisodes: BottomNavFeature = FeatureEpisodes()

    override val featureLocations: BottomNavFeature = FeatureLocations()
}