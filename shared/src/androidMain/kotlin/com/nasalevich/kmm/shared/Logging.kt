package com.nasalevich.kmm.shared

import co.touchlab.kermit.LogcatLogger
import co.touchlab.kermit.Logger

actual fun getLogger(): Logger = LogcatLogger()