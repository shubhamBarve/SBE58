package Daily;

public class MaximumSwap {
    public static void main(String[] args) {
            int num=2736;
        System.out.println(maximumSwap(num));
    }
    public static int maximumSwap(int num) {

        char[] numbers = Integer.toString(num).toCharArray();
        int [] ind = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            ind[numbers[i]-'0']=i;
        }

        for (int i = 0; i <numbers.length ; i++) {
            for(int j=9;j>ind[i]-'0';j--){
                if(ind[j]>i){
                    char temp = numbers[i];
                    numbers[i] = numbers[ind[j]];
                    numbers[ind[j]] = temp;
                    return Integer.parseInt(new String(numbers));
                }
            }

        }

        return num;
    }
}
