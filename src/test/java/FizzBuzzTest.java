import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void count_off_normal_number() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 1;
        assertEquals("1", fizzbuzz.countOff(number));
    }

    @Test
    void count_off_multiple_of_3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 3;
        assertEquals("Fizz", fizzbuzz.countOff(number));
    }

    @Test
    void count_off_multiple_of_5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 5;
        assertEquals("Buzz", fizzbuzz.countOff(number));
    }

    @Test
    void count_off_multiple_of_3_and_5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 15;
        assertEquals("FizzBuzz", fizzbuzz.countOff(number));
    }

    @Test
    void count_off_multiple_of_3_and_7() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 21;
        assertEquals("FizzWhizz", fizzbuzz.countOff(number));
    }

    @Test
    void count_off_multiple_of_5_and_7() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 35;
        assertEquals("BuzzWhizz", fizzbuzz.countOff(number));
    }

    @Test
    void count_off_multiple_of_3_and_5_and_7() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 105;
        assertEquals("FizzBuzzWhizz", fizzbuzz.countOff(number));
    }

    @Test
    void count_off_multiple_of_7() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 7;
        assertEquals("Whizz", fizzbuzz.countOff(number));
    }

}
