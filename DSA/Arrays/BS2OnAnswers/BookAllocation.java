package Arrays.BS2OnAnswers;

public class BookAllocation {

    public static void main(String[] args) {
        int arr[]={25,46,28,49,24};
        int n =arr.length;
        int students =4;
        System.out.println(Bookallocation(arr,n,students));
    }
    public static int Bookallocation(int []arr,int n ,int students){
        int max=0;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            max=Math.max(max,arr[i]);
            sum+=arr[i];

        }


        //Optimal

        int low = max;
        int high = sum;

        while (low<=high){

            int mid = (low+high)/2;
            int temp = findAnswer(arr,mid);

            if(temp>students){
                low=mid+1;
            }else high=mid-1;

        }

            return low;
/*
        for (int i = max; i <=sum ; i++) {

            if(findAnswer(arr,i)==students){
                return i;
            }


        }


        //System.out.println(sum);

        return 0;*/
    }

    private static int findAnswer(int[] arr, int max) {

        int stu =1;
        int pagesPerstudent=0;

        for (int i = 0; i <arr.length ; i++) {
            if((pagesPerstudent+arr[i])<=max){
                pagesPerstudent+=arr[i];
            }
            else {
                stu++;
                pagesPerstudent= arr[i];
            }
        }
        return stu;

    }
}
