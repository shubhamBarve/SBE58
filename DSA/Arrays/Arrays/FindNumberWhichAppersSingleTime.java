package Arrays;

public class FindNumberWhichAppersSingleTime {
    public static void main(String[] args) {
        int arr[]={4,1,4,2,1};
        int xor=0;
        for (int i = 0; i <arr.length; i++) {
            xor = xor ^ arr[i];


        }
        System.out.println(xor);
    }
}
