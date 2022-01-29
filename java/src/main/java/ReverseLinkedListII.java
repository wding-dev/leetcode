import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<Integer>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);

        int left = 2;
        int right = 4;

        LinkedList<Integer> result = solution(head, left, right);
        System.out.println(result);

        int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
    }

    public static LinkedList solution(LinkedList<Integer> head, int left, int right) {
        LinkedList result = new LinkedList<Integer>();

        if ((left == 1) && (right == 1)) {
            result = head;
        }

        ArrayList<Integer> subList = new ArrayList<Integer>();


        return result;
    }
}
