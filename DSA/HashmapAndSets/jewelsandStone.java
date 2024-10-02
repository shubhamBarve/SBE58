package HashmapAndSets;

import java.util.HashSet;
import java.util.Set;

public class jewelsandStone {
    public static void main(String[] args) {
        String jeweles = "A";
        String stones = "fdsb";
        System.out.println(numJewelsInStones(jeweles,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i <jewels.length() ; i++) {
            set.add(jewels.charAt(i));
        }
            int count=0;
        for (int i = 0; i <stones.length() ; i++) {
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }

return count;

    }
}
