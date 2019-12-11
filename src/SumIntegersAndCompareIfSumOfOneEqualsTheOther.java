import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SumIntegersAndCompareIfSumOfOneEqualsTheOther {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        // check if input is an integer
        if(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
        }
        else{
            System.out.println("Please enter an integer for both inputs");
            return;
        }

        // Call the IntegerSumCheck function to perform the service
        boolean result = IntegerSumCheck(a, b);

        System.out.println("The result is: " + result);
    }

    // Here, we convert the given integer 'a' into a string the take each character in 'a',
    // convert it back to integer then sum.
    public static boolean IntegerSumCheck(int a, int b){
        // We assume b > a
        String new_a = Integer.toString(a);
        int sum_value = 0; // sums the digits in a number eg. 23 => 2+3 = 5
        for(int i = 0; i < new_a.length(); i++){
            int digit_at_i = Integer.parseInt(String.valueOf(new_a.charAt(i))); // extract the digit at i
            sum_value += digit_at_i;
        }
        int new_sum_value = a + sum_value;

        if(b == new_sum_value){  // compares the sum of the digits in input 'a' + 'a' to b
                                 // returns true if validated else false
            return true;
        }

        return false;
    }

}

