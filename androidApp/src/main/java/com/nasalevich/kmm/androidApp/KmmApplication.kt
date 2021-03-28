package com.nasalevich.kmm.androidApp

import android.app.Application
import co.touchlab.kermit.Kermit
import com.nasalevich.kmm.androidApp.di.appModule
import com.nasalevich.kmm.shared.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KmmApplication : Application(), KoinComponent {

    private val logger: Kermit by inject()

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger()
            androidContext(this@KmmApplication)
            modules(appModule)
        }

        logger.i { "KmmApplication has started" }
    }
}