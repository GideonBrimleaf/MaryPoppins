import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WrestlerTest {

    val mary = Wrestler("Mary Poppins", 40, "Supercalafraglistic")

    @Test
    fun `wrestler has name, age and finisher` () {
        assertEquals("Mary Poppins", mary.name)
        assertEquals(40, mary.age)
        assertEquals("Supercalafraglistic", mary.finisher)
    }

}