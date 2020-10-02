const fizzbuzz = require('./FizzBuzz')

test('returns the same number as input if not multiple of 5 nor 3', () => {
    expect(fizzbuzz(4)).toBe(4)
})