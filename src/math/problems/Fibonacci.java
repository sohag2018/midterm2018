package math.problems;


import java.util.Arrays;
public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        int fibo[]= new int[40];
        for(int i=0;i<40;i++){
            if (i<2){
                fibo[i]=i;
            }else{
                fibo[i]=fibo[i-1]+fibo[i-2];
            }

            System.out.println(Arrays.toString(fibo));
        }
    }
}
