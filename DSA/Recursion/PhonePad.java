package Recursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
       // pad("","2");
        System.out.println(phonePad("","7"));
    }

    public static void pad(String proc,String unp){
        if(unp.isEmpty()){
            System.out.println(proc);
            return;
        }

        int digits = unp.charAt(0) - '0';

        for(int i = (digits-1)*3; i<digits*3;i++ ){

            char ch = (char)('a'+i);
            pad(proc+ch,unp.substring(1));
        }
    }


    public static ArrayList<String> phonePad(String proc, String unp){
        if(unp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        int digits = unp.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        if(digits==7){
            for(int i = (digits-1)*3 -3; i<digits*3 -2;i++ ){

                char ch = (char)('a'+i);
                ans.addAll(phonePad(proc+ch,unp.substring(1)));
            }

        }else if(digits==8) {
            for (int i = (digits - 1) * 3 - 3; i < digits * 3-3 ; i++) {

                char ch = (char) ('a' + i+1);
                ans.addAll(phonePad(proc + ch, unp.substring(1)));
            }
        }else if(digits==9) {
            for (int i = (digits - 1) * 3 - 3; i < digits * 3-2 ; i++) {

                char ch = (char) ('a' + i+1);
                ans.addAll(phonePad(proc + ch, unp.substring(1)));
            }
        }

        else {
            for (int i = (digits - 1) * 3 - 3; i < digits * 3 - 3; i++) {

                char ch = (char) ('a' + i);
                ans.addAll(phonePad(proc + ch, unp.substring(1)));
            }
        }
        return ans;



    }
}
