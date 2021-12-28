import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RegularExpressionMatchingTest {
    @ParameterizedTest
    @CsvSource(
        value = {
            "ab:a.:true",
            "ab:.b:true",
            "ab:b.:false",
            "aa:a*:true",
            "abcd:c*:false",
            "abbb:abb*:true",
            "bbb:bb*:true",
            "ab:.*:true",
            "aa:a:false"
        },
        delimiter = ':'
    )
    public void regularExpressionMatchingTest(String s, String p, String expectedResult) {
        assert String.valueOf(RegularExpressionMatching.solution(s, p)).equals(expectedResult);
    }
}
