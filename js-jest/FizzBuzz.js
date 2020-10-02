function fizzbuzz(number) {
    if (number === 0) {
        return "0";
    }
    if ((number % 3 == 0)&&(number % 5 == 0)) {
        return "FizzBuzz"
    }
    if ((number % 3 == 0)||((""+number).includes("3"))) {
        return "Fizz"
    }
    if ((number % 5 == 0)||((""+number).includes("5"))) {
        return "Buzz"
    }
    return ""+number
}

module.exports = fizzbuzz