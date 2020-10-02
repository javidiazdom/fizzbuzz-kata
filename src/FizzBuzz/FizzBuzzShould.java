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
    }
}
