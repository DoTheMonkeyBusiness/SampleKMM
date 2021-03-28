package com.nasalevich.kmm.androidApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nasalevich.core.featureProvider.FeatureProvider
import com.nasalevich.navigation.navGraph.NavGraph
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val featureProvider: FeatureProvider by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NavGraph(featureProvider.featureMain.route) { controller ->
                featureProvider.featureMain.composeLayout(this, controller)
            }
        }
    }
}
