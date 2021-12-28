import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ReverseIntegerTest {
    @ParameterizedTest
    @CsvSource(
        value = {"1534236469:0"},
        delimiter = ':'
    )
    public void reverseIntegerTest(int number) {
        assert ReverseInteger.solution(number) == 0;
    }
}
