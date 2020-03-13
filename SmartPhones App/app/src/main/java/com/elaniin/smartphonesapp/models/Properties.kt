package com.elaniin.smartphonesapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Properties(

    val ram: String,

    val processor: String,

    val hasSSD : Boolean

) : Parcelable