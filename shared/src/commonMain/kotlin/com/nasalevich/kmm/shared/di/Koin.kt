package com.nasalevich.kmm.shared.di

import co.touchlab.kermit.Kermit
import com.nasalevich.kmm.shared.getLogger
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(commonModule())
    }

fun initKoin() = initKoin() {}

fun commonModule() = module {
    single { Kermit(getLogger()) }
}