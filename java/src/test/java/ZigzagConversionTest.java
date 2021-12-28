import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ZigzagConversionTest {
    @ParameterizedTest
    @CsvSource(
        value = {
            "PAYPALISHIRING:PAHNAPLSIIGYIR"
        },
        delimiter = ':'
    )
    public void zigzagConversionTest(String input, String expectedResult) {
        int numRows = 3;
        assert ZigzagConversion.solution(input, numRows).equals(expectedResult);
    }
}
