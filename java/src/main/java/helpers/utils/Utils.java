package helpers.utils;

public class Utils {
    public static void main(String[] args) {
        String test = "1,2,3,4,5";
        convertStringToStringArray(test);
        convertStringToIntegerArray(test);
    }

    public static String[] convertStringToStringArray(String input) {
        String[] result = input.split("\\s*,\\s*");

        return result;
    }

    public static Integer[] convertStringToIntegerArray(String input) {
        String[] tmp = input.split("\\s*,\\s*");
        Integer[] result = new Integer[tmp.length];

        for (int i = 0; i < tmp.length; i++) {
            result[i] = Integer.parseInt(tmp[i]);
        }

        return result;
    }

}
