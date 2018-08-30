package me.amadeucavalcante.a2048.model

data class Position(val x: Int, val y: Int) {

    override fun toString(): String {
        return x.toString() + y.toString()
    }
}