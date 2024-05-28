package Problems;


public class GetEqualSubstringsWithinBudget {
    public static void main(String[] args) {
        String s = "abcd";
        String t ="cdef";
        int maxCost = 3;
        //System.out.println(equalSubstring(s,t,maxCost));
        System.out.println(EqualSubstring(s,t,maxCost));
    }
    private static int EqualSubstring(String s,String t,int maxCost){
        int j =0;
        for (int i = 0; i < s.length(); ++i) {
            maxCost -= Math.abs(s.charAt(i) - t.charAt(i));
            if (maxCost < 0)
                maxCost += Math.abs(s.charAt(j) - t.charAt(j++));
        }

        return s.length() - j;
    }

    private static int equalSubstring(String s, String t, int maxCost) {
        int val = 0;
        if( maxCost==0){
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            val += Math.abs(s.charAt(i)-t.charAt(i));
            if(val>=maxCost){
                return i+1;
            }
        }
        return 0;

    }
    }



