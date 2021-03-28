package com.nasalevich.kmm.androidApp.features

import com.nasalevich.core.featureProvider.Feature
import com.nasalevich.core.featureProvider.FeatureProvider
import com.nasalevich.kmm.androidApp.FeatureMain

class FeatureProviderImpl : FeatureProvider {

    override val featureMain: Feature = FeatureMain()
}