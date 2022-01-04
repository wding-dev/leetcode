import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ContainerWithMostWaterTest {
    @ParameterizedTest
    @CsvSource(
        value = {
            "[1,8,6,2,5,4,8,3,7]:49",
            "[1,1]:1"
        },
        delimiter = ':'
    )
    public void regularExpressionMatchingTest(String heights, String expectedResult) {
        // assert String.valueOf(RegularExpressionMatching.solution(s, p)).equals(expectedResult);
    }
}
