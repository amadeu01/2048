package me.amadeucavalcante.a2048.viewmodel

import android.databinding.ObservableArrayMap
import android.databinding.ObservableField

class GameViewModel {
    val tiles = ObservableArrayMap<String, String>()
    val score = ObservableField<String>("score")
    val winner = ObservableField<String>("Something")

    init {
        tiles["00"] = "0"
        tiles["01"] = "0"
        tiles["02"] = "0"
        tiles["03"] = "0"

        tiles["10"] = "0"
        tiles["11"] = "0"
        tiles["12"] = "0"
        tiles["13"] = "0"

        tiles["20"] = "0"
        tiles["21"] = "0"
        tiles["22"] = "0"
        tiles["23"] = "0"

        tiles["30"] = "0"
        tiles["31"] = "0"
        tiles["32"] = "0"
        tiles["33"] = "0"
    }
}