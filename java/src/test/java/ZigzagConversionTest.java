import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ZigzagConversionTest {
    @ParameterizedTest
    @CsvSource(
        value = {
            "PAYPALISHIRING:3:PAHNAPLSIIGYIR"
        },
        delimiter = ':'
    )
    public void zigzagConversionTest(String input, int numRows, String expectedResult) {
        assert ZigzagConversion.solution(input, numRows).equals(expectedResult);
    }
}
