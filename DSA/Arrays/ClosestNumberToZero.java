package Arrays;

public class ClosestNumberToZero {

    public static void main(String[] args) {
        int [] nums = {5,-1};
        System.out.println(findClosestNumber(nums));
    }

    public static int findClosestNumber(int[] nums) {
            int num = 0;
            int dist=Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int curDist = (nums[i]);
            if(nums[i]<0)
             curDist = -(nums[i]);

            if(curDist<=dist) {
                if(curDist == dist){
                    if(nums[i]>0){
                    dist = Math.min(dist, curDist);
                    num = i;}
                }else {
                    dist = Math.min(dist, curDist);
                    num = i;
                }
            }
        }
        return nums[num];

    }
}
