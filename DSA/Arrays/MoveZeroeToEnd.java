package Arrays;

public class MoveZeroeToEnd {
    public static void main(String[] args) {
        int arr[]= {1,2,0,0,7,6,4,0,1,0};

        //Below is bruteForce approach
       // moveZeroes(arr);

        // optimal
        moveZeroesOptimal(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
    }

    private static void moveZeroesOptimal(int[] arr) {
            int j=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for (int i = j+1; i <arr.length ; i++) {
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;

            }
        }

    }

    private static void moveZeroes(int[] arr) {
        int temp [] = new int[arr.length];
        for(int i =0,j=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }


        for(int i =0;i<arr.length;i++) {

                arr[i] = temp[i];


        }
    }

    }

