package Patterns;

public class Patterns {

    public static void main(String[] args) {
        int n= 4;
       // pattern1(n);
       // pattern2(n);
       // pattern3(n);
       // pattern4(n);
       // pattern5(n);

       // pattern6(n);
        pattern7(n);


    }

    private static void pattern7(int n) {
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n)
                stars=2*n-i;
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            System.out.println();



        }

    }

    private static void pattern1(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(""+j);
            }
            System.out.println();
        }

    }
    private static void pattern2(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(""+i);
            }
            System.out.println();
        }

    }

    private static void pattern3(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    private static void pattern4(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static void pattern5(int n) {
        for (int i = 0; i <n ; i++) {

            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            //space


            System.out.println();
        }
    }



    private static void pattern6(int n) {
        for (int i = 0; i <n ; i++) {

            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }

            //space


            System.out.println();
        }
    }
}
