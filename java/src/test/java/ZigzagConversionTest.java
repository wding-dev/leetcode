import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ZigzagConversionTest {
    @ParameterizedTest
    @ValueSource(strings = {"PAYPALISHIRING"})
    public void zigzagConversionTest(String input) {
        int numRows = 3;
        assert ZigzagConversion.solution(input, numRows).equals("PAHNAPLSIIGYIR");
    }
}
