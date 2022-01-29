public class RemoveDuplicatesFromSortedArrayII {

    public static int solution(int[] nums) {
        if(nums==null){
            return 0;
        }

        if (nums.length <= 2){
            return nums.length;
        }

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {

                if (i == 0) {
                    i++;
                    j++;
                } else if(nums[i] == nums[i-1]) {
                    j++;
                } else {
                    i++;
                    nums[i] = nums[j];
                    j++;
                }
            } else {
                // j is pointing to an element which is different to i
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i+1;
    }
}
