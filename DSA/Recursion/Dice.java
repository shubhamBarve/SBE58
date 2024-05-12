package Recursion;

public class Dice {
    public static void main(String[] args) {
        diceTarge("",6);
    }

    public static void diceTarge(String proc,int target){

        if(target == 0){
            System.out.println(proc);
            return;
        }

        for(int i =1 ;i<=6 && i<=target;i++){
            diceTarge(proc+i,target-i);
        }


    }
}
