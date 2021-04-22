package nick.white;

public class Medium_11_30_ConntainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;

        int aPointer = 0;
        int bPointer = height.length - 1;

        while (aPointer < bPointer) {
            maxArea = Math.max(maxArea, Math.min(height[aPointer], height[bPointer]) * (bPointer - aPointer));

//            int newArea = Math.min(height[aPointer+1], height[bPointer]) * (bPointer - aPointer -1);
//            if(newArea>maxArea) {
//                aPointer++;
//                maxArea = newArea;
//            } else {
//
//            }

            if (height[aPointer] < height[bPointer]) {
                aPointer++;
            } else {
                bPointer--;
            }
        }
        return maxArea;
    }

}
