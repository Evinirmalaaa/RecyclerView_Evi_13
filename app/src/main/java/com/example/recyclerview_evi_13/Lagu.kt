package com.example.recyclerview_evi_13

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Lagu(
    val imgLagu: Int,
    val nameLagu: String,
    val descLagu: String,
) :Parcelable
