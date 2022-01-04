public class ContainerWithMostWater {

    public static void main(String[] args) {
        solution();
    }

    public static int solution() {

        int maxSize = 0;
        int size = 0;
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int height = 0;
        int length = 0;

        for (int i = 0; i < heights.length; i++) {

            for (int j = 0; j < heights.length; j++) {

                if (j != i) {
                    System.out.println("heights[i]:" + heights[i]);
                    System.out.println("heights[j]:" + heights[j]);

                    height = Math.min(heights[i], heights[j]);
                    length = Math.abs(j - i);

                    System.out.println("height:" + height);
                    System.out.println("length:" + length);


                    size = height * length;

                    System.out.println("size:" + size);

                    if (size > maxSize) {
                        maxSize = size;
                    }
                    System.out.println("");
                }


            }

        }
        System.out.println("maxSize:" + maxSize);
        return maxSize;
    }
}
