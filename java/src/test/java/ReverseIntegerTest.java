import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ReverseIntegerTest {
    @ParameterizedTest
    @ValueSource(ints = {1534236469})
    public void reverseIntegerTest(int number) {
        assert ReverseInteger.solution(number) == 0;
    }
}
