package Problems;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int height []= {3,1,2,4,0,1,3,2};
        System.out.println(rainWater(height));
    }

    private static int rainWater(int[] height) {

        int water=0;
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int maxLeft = height[0];
        left[0]=maxLeft;
        for (int i = 1; i < height.length; i++) {

            maxLeft= Math.max(maxLeft,height[i]);
                left[i]=maxLeft;

        }
        int maxright = height[height.length-1];
        right[height.length-1]=maxright;
        for (int i = height.length-2; i >= 0; i--) {

            maxright= Math.max(maxright,height[i]);
            right[i]=maxright;

        }


        for (int i = 0; i < height.length; i++) {
            water+=Math.min(left[i],right[i])-height[i];
        }

        return water;
    }

}
