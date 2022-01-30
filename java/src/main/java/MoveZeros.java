public class MoveZeros {
    public static int[] solution(int[] nums) {
        int size = nums.length;
        int[] result = new int[nums.length];

        int i = 0;
        int j = 0;

        while (j < size) {
            if (nums[j] == 0) {
                j++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        for (int k = i; k < size; k++) {
            nums[k] = 0;
        }

        return result;
    }
}
