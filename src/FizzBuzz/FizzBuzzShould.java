package FizzBuzz;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzShould {
    private FizzBuzz fizzBuzz;

    @Before
    public void setup () {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void return_the_same_number_as_input_if_not_multiple_of_3_or_5 () {
        Assertions.assertThat(this.fizzBuzz.get(22)).isEqualTo("22");
        Assertions.assertThat(this.fizzBuzz.get(0)).isEqualTo("0");
    }

    @Test
    public void return_fizz_if_the_number_is_multiple_of_3 () {
        Assertions.assertThat(this.fizzBuzz.get(6)).isEqualTo("Fizz");
    }

    @Test
    public void return_buzz_if_the_number_is_multiple_of_5 () {
        Assertions.assertThat(this.fizzBuzz.get(10)).isEqualTo("Buzz");
    }

    @Test
    public void return_fizzbuzz_if_multiple_of_both_3_and_5 () {
        Assertions.assertThat(this.fizzBuzz.get(15)).isEqualTo("FizzBuzz");
    }
}
