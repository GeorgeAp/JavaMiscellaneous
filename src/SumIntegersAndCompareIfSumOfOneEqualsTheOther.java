import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SumIntegersAndCompareIfSumOfOneEqualsTheOther {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
        }
        else{
            System.out.println("Please enter an integer for both inputs");
            return;
        }


        boolean result = IntegerSumCheck(a, b);

        System.out.println("The result is: " + result);
    }

    public static boolean IntegerSumCheck(int a, int b){
        // We assume b > a
        String new_a = Integer.toString(a);
        int sum_value = 0; // sums the digits in a number eg. 23 => 2+3 = 5
        for(int i = 0; i < new_a.length(); i++){
            int j = Integer.parseInt(String.valueOf(new_a.charAt(i)));
            sum_value += j;
        }
        int new_sum_value = a + sum_value;

        if(b==new_sum_value){
            return true;
        }

        return false;
    }

}

