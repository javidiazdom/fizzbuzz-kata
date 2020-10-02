package FizzBuzz



class FizzBuzz {
    fun get (number:Int) : String {
        if (number == 0){
            return "0"
        }
        if (number % 3 == 0) {
            return "Fizz"
        }
        return number.toString()
    }
}

