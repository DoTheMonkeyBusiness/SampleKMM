package com.nasalevich.kmm.androidApp.di

import com.nasalevich.core.featureProvider.FeatureProvider
import com.nasalevich.kmm.androidApp.feature.FeatureProviderImpl
import org.koin.dsl.module

val appModule = module {
    single<FeatureProvider> { FeatureProviderImpl() }
}