package ru.gb.lesson1kotlin

object NewPigs {
    val pig = Pigs()

    val pig3 = pig.copy(name = "Нюф-Нюф", weight = 9)
}