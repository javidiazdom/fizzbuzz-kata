const fizzbuzz = require('./FizzBuzz')

test('returns the same number as input if not multiple of 5 nor 3', () => {
    expect(fizzbuzz(4)).toBe('4')
    expect(fizzbuzz(0)).toBe('0')
})

test('returns fizz when the number passed is multiple of 3', () => {
    expect(fizzbuzz(6)).toBe('Fizz');
})

test('returns buzz when the number passed is multiple of 5', () => {
    expect(fizzbuzz(10)).toBe('Buzz');
})

test('returns fizzbuzz if the number is multiple of 5 and 3', () => {
    expect(fizzbuzz(15)).toBe('FizzBuzz')
}) 

test('returns fizz if the number contains 3', () => {
    expect(fizzbuzz(31)).toBe('Fizz');
})

test('returns buzz if the number contains 5', () => {
    expect(fizzbuzz(52)).toBe('Buzz');
})