import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntegerToRomanTest {
    @ParameterizedTest
    @CsvSource(
        value = {
            "3:III",
            "58:LVIII",
            "1994:MCMXCIV"
        },
        delimiter = ':'
    )
    public void integerToRomanTest(int input, String expectedResult) {
        assert IntegerToRoman.solution(input).equals(expectedResult);
    }
}
//        HashMap<Integer, String> intToRomanMap = new HashMap<Integer, String>();
//        intToRomanMap.put(1, "I");
//        intToRomanMap.put(5, "V");
//        intToRomanMap.put(10, "X");
//        intToRomanMap.put(50, "L");
//        intToRomanMap.put(100, "C");
//        intToRomanMap.put(500, "D");
//        intToRomanMap.put(1000, "M");
