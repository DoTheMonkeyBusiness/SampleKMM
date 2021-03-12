package com.nasalevich.kmm.shared

import com.nasalevich.kmm.appResources.MR
import dev.icerock.moko.resources.desc.ResourceFormatted
import dev.icerock.moko.resources.desc.StringDesc

class Greeting {

    fun greeting(): StringDesc {
        return StringDesc.ResourceFormatted(MR.strings.greeting, Platform().platform)
    }
}
