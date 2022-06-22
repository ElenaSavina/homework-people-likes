package ru.netology

fun main() {
    val likes = 4523

    if ((likes % 1000) == 0) {
        println("Понравилось $likes людей")
    } else if ((likes % 10) == 1 && (likes % 100) != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}