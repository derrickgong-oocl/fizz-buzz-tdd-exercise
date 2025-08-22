public class FizzBuzz {

    public String countOff(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0) {
            stringBuilder.append("Fizz");
        }
        if (number % 5 == 0) {
            stringBuilder.append("Buzz");
        }
        if (number % 7 == 0) {
            stringBuilder.append("Whizz");
        }
        return stringBuilder.length() == 0 ? String.valueOf(number) : stringBuilder.toString();
    }
}
