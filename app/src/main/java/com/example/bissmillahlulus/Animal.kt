package com.example.bissmillahlulus

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Animal(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0): Parcelable

