package Daily;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int []code = {10,5,7,7,3,2,10,3,6,9,1,6};
    int k = -4;
int ans[]= decrypt(code,k);
for(int i : ans){
    System.out.print(i+" ");
}
    }

    public static int[] decrypt(int[] code, int k) {
        int ans[] = new int[code.length];
            if(k==0){
                return ans;
            }
            int n=code.length;
            int prefixSum[]=new int[code.length*2];
            prefixSum[0]=code[0];
        for (int i = 1; i <prefixSum.length ; i++) {
            int sum =code[i%n];
            prefixSum[i]=prefixSum[i-1]+sum;
        }

        if(k<0) {
            for (int i = n; i < prefixSum.length; i++) {
                ans[i-n]=prefixSum[i-1]-prefixSum[i+k-1];
            }
        }else {
            for (int i = 0; i <code.length ; i++) {
                ans[i]=prefixSum[i+k]-prefixSum[i];

            }
        }

            return ans;


    }
}
