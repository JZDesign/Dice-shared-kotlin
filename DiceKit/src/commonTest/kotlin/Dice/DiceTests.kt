package Dice

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class DiceTests() {
    @Test
    fun `dice have the correct number of sides`() {
        assertEquals(D20().sides, 20)
        assertEquals(D12().sides, 12)
        assertEquals(D10().sides, 10)
        assertEquals(D8().sides, 8)
        assertEquals(D6().sides, 6)
        assertEquals(D4().sides, 4)
    }

    @Test
    fun `Rolls do not output zeros`() {
        (0..1000).forEach { assertNotEquals(D4().roll(), 0) }
    }
}
