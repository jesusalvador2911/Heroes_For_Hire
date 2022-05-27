package com.example.heroesforhire

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

class Superhero(val name: String, val alterEgo:String, val bio: String, val power: Float) :
    Parcelable {
}