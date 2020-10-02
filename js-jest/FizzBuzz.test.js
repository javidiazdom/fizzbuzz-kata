const fizzbuzz = require('./FizzBuzz')

test('returns the same number as input if not multiple of 5 nor 3', () => {
    expect(fizzbuzz(4)).toBe('4')
    expect(fizzbuzz(0)).toBe('0')
})

test('returns fizz when the number passed is multiple of 3', () => {
    expect(fizzbuzz(6)).toBe('Fizz');
})