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
