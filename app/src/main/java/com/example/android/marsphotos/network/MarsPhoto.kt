package com.example.android.marsphotos.network

import com.squareup.moshi.Json

data class MarsPhoto (
    @Json(name = "img_src") val imgSrcUrl: String
) {
    val id: Any
        get() {
            TODO()
        }
}