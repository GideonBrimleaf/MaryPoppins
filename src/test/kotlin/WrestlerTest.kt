import models.Wrestler
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WrestlerTest {

    private val mary = Wrestler("Mary Poppins", 40, "Supercalafraglistic")

    @Test
    fun `wrestler has name, age and finisher` () {
        assertEquals("Mary Poppins", mary.name)
        assertEquals(40, mary.age)
        assertEquals("Supercalafraglistic", mary.finisher)
    }

    @Test
    fun `wrestler can yell name`() {
        assertEquals("I'm Mary Poppins Y'All!", mary.yell())
    }

}