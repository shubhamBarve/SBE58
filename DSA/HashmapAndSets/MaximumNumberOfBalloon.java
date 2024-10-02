package HashmapAndSets;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloon {
    public static void main(String[] args) {
       String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));

    }
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);

        for (int i = 0; i < text.length(); i++) {
            if(map.containsKey(text.charAt(i))){
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            }
        }
        map.put('l',map.get('l')/2);
        map.put('o',map.get('o')/2);

        //int min = Math.min(Math.min(map.get('b'),map.get('a')),Math.min(map.get('l'),map.get('o')),map.get('n'));
        int min =Math.min(Math.min(Math.min(Math.min(map.get('b'),map.get('a')),map.get('l')),map.get('o')),map.get('n'));
        return min;
    }
}
