package FizzBuzz;

import org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.Before

class FizzBuzzShould {
    private lateinit var fizzBuzz : FizzBuzz

    @Before
    fun setup () {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun return_the_same_number_as_input_if_not_multiple_of_3_or_5 () {
        assertThat(fizzBuzz.get(22)).isEqualTo("22")
        assertThat(fizzBuzz.get(0)).isEqualTo("0")
    }
}