package ru.netology

fun main() {
    val likes = 111

    val endPhrase =
        if ((likes % 1000) == 0) "людей"
        else if ((likes % 10) == 1 && (likes % 100) != 11) "человеку"
        else "людям"

    println("Понравилось $likes $endPhrase")

}