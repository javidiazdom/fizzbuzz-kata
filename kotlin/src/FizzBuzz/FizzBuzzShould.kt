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

    @Test
    fun return_fizz_if_the_number_is_multiple_of_3 () {
        assertThat(fizzBuzz.get(6)).isEqualTo("Fizz")
    }

    @Test
    fun return_buzz_if_the_number_is_multiple_of_5 () {
        assertThat(fizzBuzz.get(10)).isEqualTo("Buzz")
    }

    @Test
    fun return_fizzbuzz_if_the_number_is_multiple_of_5_and_3 () {
        assertThat(fizzBuzz.get(15)).isEqualTo("FizzBuzz")
    }
}