import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.LinkedList;

public class ReverseLinkedListIITest {
    @ParameterizedTest
    @CsvSource(
        value = {
            "[1,2,3,4,5]:2:4:[1,4,3,2,5]",
            "[5]:1:1:[5]"
        },
        delimiter = ':'
    )
    public void reverseLinkedListIITest(String headInput, String leftInput, String rightInput, String expectedResult) {
        LinkedList<Integer> head = new LinkedList<Integer>();
        int left = Integer.valueOf(leftInput);
        int right = Integer.valueOf(rightInput);
        LinkedList<Integer> result = new LinkedList<Integer>();



        assert ReverseLinkedListII.solution(head, left, right) == result;
    }
}
