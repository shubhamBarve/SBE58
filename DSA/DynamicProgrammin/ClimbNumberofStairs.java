package DynamicProgramming;

public class ClimbNumberofStairs {
    public static void main(String[] args) {

        System.out.println("Output " + climbStairsDynamic(45));
    }
        public static int climbStairs(int n) {
            if(n==1) return 1;
            if (n==2) return 2;
            return climbStairs(n-1)+climbStairs(n-2);
        }
        public static int climbStairsDynamic(int n){
            if (n == 1) return 1;
            if (n == 2) return 2;

            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <=n; i++) {
                dp[i]=dp[i-1]+dp[i-2];

            }
            return dp[n];
        }
    }

