package com.example.kotlinrecyclerview

import kotlin.random.Random


data class Fruit(
    val name: String,
    val origin: String,
    val quantity: Int
) {
    companion object {
        val FRUIT_NAMES = arrayOf(
            "Apple", "Mango", "Pinapple", "Strawberry",
            "Banana", "Kiwi", "Grapes", "Guava"
        )

        val ORIGIN = arrayOf(
            "Lucknow", "Nagpur", "Srinangar", "Pune", "Patna", "Mysore", "Pune", "Mumbai"
        )


        fun genRandomFruits(n: Int): ArrayList<Fruit> {
            val fruitArray = ArrayList<Fruit>(n)


            for (i in 1..n) {
                fruitArray.add(
                    Fruit(
                        FRUIT_NAMES[Random.nextInt(8)],
                        ORIGIN[Random.nextInt(8)],
                        Random.nextInt(10)
                    )
                )
            }
            return fruitArray
        }
    }
}