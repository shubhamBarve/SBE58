package SlidingWindowAnd2Pointer;

public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {

        String str = "bbacba";

      //  int count = findUsingBruteForce(str);
       // System.out.println("Count "+count);

        int optimal = findUsingOptimal(str);
        System.out.println("Count using optimal "+optimal);

    }

    private static int findUsingOptimal(String str) {
        int count = 0;
        int hash[]= {-1,-1,-1};

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)-'a']=i;
            count = count+ (1+Math.min(hash[0],Math.min(hash[1],hash[2])));

        }

        return count;

    }

    private static int findUsingBruteForce(String str){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int hash[] = new int[3];
            for (int j = i; j <str.length() ; j++) {
                        hash[str.charAt(j)-'a']=1;

                        if (hash[0]+hash[1]+hash[2]==3){
                            count++;
                        }

            }
        }

        return count;

    }
}
