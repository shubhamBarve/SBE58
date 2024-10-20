package Daily;

public class LongestHappyString {
//https://leetcode.com/problems/longest-happy-string/description/?envType=daily-question&envId=2024-10-16
    public static void main(String[] args) {
        int a = 1, b = 1, c = 7;

        System.out.println(longestDiverseString(a,b,c));
    }
    public static String longestDiverseString(int a, int b, int c) {

        StringBuilder sb = new StringBuilder();
        int A=0;

        int   B=0;
                int C=0;
        int length = a+b+c;

        while (length-->0){
            if((a>=b && a>=c && A!=2) || (a>0 && (B==2 || C==2))){
                    sb.append('a');
                    A++;
                    a--;
                    B=0;
                    C=0;
            }
           else if((b>=a && b>=c && B!=2) || (b>0 && (A==2 || C==2))){
                sb.append('b');
                B++;
                b--;
                A=0;
                C=0;
            }
           else if((c>=b && c>=a && C!=2) || (c>0 && (A==2 || B==2))){
                sb.append('c');
                C++;
                c--;
                A=0;
                B=0;
            }
        }return  sb.toString();

    }
}
