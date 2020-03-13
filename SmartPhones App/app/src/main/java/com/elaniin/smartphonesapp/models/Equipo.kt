package com.elaniin.smartphonesapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Equipo(
    val name: String,

    val stock: Int,

    val image: String,

    val properties: Properties
) : Parcelable