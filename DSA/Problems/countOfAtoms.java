package Problems;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class countOfAtoms {

    public static void main(String[] args) {
        String formula = "Mg(OH)2";

        System.out.println(countOfAtomsOptimalString(formula));

    }

    public static  String countOfAtomsOptimalString (String formula) {
    String ans ="";
   Stack<TreeMap<String,Integer>> stack  =  new Stack<>();

stack.push(new TreeMap<>());
      int i =0;

    while (i<formula.length()){
        char ch = formula.charAt(i);

            if(ch=='('){
                stack.push(new TreeMap<>());
                i++;
            } else if (ch ==')') {
                i++;
                int product = 0;
                while (i<formula.length() && Character.isDigit(formula.charAt(i))){
                    product = product*10 +(formula.charAt(i)-'0');
                    i++;
                }
                product = product==0?1:product;
                TreeMap<String,Integer> map = stack.pop();

                for (String atom : map.keySet()){
                    stack.peek().put(atom,stack.peek().getOrDefault(atom,0)+map.get(atom)*product);
                }


            }else {
                StringBuilder sb = new StringBuilder();
                sb.append(ch);
                i++;
                while (i<formula.length() && Character.isLowerCase(formula.charAt(i))){
                    sb.append(formula.charAt(i));
                    i++;
                }

                String str =sb.toString();
                int count = 0;
                while (i<formula.length() && Character.isDigit(formula.charAt(i))){

                    count = count*10 + (formula.charAt(i)-'0');
                    i++;
                }

                count= count ==0?1: count;

                stack.peek().put(str,stack.peek().getOrDefault(str,0)+count);



            }


    }
        TreeMap<String,Integer> map = stack.pop();

        StringBuilder stringBuilder = new StringBuilder();

        for (String atom : map.keySet()){
            stringBuilder.append(atom);
            if(map.get(atom)>1){
                stringBuilder.append(map.get(atom));
            }
        }
        return stringBuilder.toString();



    }
}
