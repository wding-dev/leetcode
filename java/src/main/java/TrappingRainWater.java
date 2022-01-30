import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrappingRainWater {
    private static final Logger LOGGER = Logger.getLogger( TrappingRainWater.class.getName() );

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        int result = solution(nums);

        if (result == 6) {
            LOGGER.log( Level.INFO, "Answer {0}", "correct");
        } else {
            LOGGER.log( Level.SEVERE, "Answer {0}", "incorrect");
        }
    }

    public static int solution(int[] height) {
        int result = 0;

        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        while (leftPointer < rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {

                if (height[leftPointer] > leftMax) {
                    leftMax = height[leftPointer];
                } else {
                    result += leftMax - height[leftPointer];
                }

                leftPointer++;
            } else {

                if (height[rightPointer] > rightMax) {
                    rightMax = height[rightPointer];
                } else {
                    result += rightMax - height[rightPointer];
                }

                rightPointer--;
            }
        }

        return result;
    }

}
