package Daily;

public class ShortestSubArrayWithK {

    public static void main(String[] args) {
        int []nums = {1,2,32,21};
        int k = 55;

        System.out.println(calculate(nums,k));



    }
    private  static  int  calculate(int []nums,int k){
        if(k==0){
            return 1;
        }
        int minlength  = Integer.MAX_VALUE;

        int left =0,right = 0;

        int or = 0;

        while (right<nums.length){
            or |=nums[right];


            while (or>=k ){
                minlength = Math.min(minlength,right-left+1);
                or ^= nums[left];
                left++;

            }

            right ++;
        }

        return (minlength == Integer.MAX_VALUE)?-1:minlength;
    }

}
