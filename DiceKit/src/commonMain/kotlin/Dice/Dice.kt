package Dice

import kotlin.random.Random

open class Dice(val sides: Int) {
    fun roll() = Random.nextInt(1, sides + 1)

    fun rollWithAdvantage(): Int {
        val first = roll()
        val second = roll()
        return if (first > second) first else second
    }

    fun rollWithDisadvantage(): Int {
        val first = roll()
        val second = roll()
        return if (first < second) first else second
    }
}

class D20: Dice(20)

class D12: Dice(12)

class D10: Dice(10)

class D8: Dice(8)

class D6: Dice(6)

class D4: Dice(4)
