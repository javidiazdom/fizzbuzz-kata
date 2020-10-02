package FizzBuzz



class FizzBuzz {
    fun get (number:Int) : String {
        if (number == 0){
            return "0"
        }
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz"
        }
        if (number % 3 == 0) {
            return "Fizz"
        }
        if (number % 5 == 0) {
            return "Buzz"
        }
        return number.toString()
    }
}

