package FizzBuzz;

public class FizzBuzz {
    public String get (int number) {
        if (number == 0) {
            return "0";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return ""+number;
    }
}
