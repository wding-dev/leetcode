public class ReverseInteger {

    public static int solution(int number) {
        int result = 0;

        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;

            if (result >= Integer.MAX_VALUE / 10) return 0;
            if (result <= Integer.MIN_VALUE / 10) return 0;
        }

        return result;
    }
}
