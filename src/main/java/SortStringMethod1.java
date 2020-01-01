/*
String class doesn’t have any method that directly sort a string,
but we can sort a string by applying other methods one after other.

Method 1:
1. Apply toCharArray() method on input string to create a char array for input string
2. Use Arrays.sort(char c[]) method to sort char array
3. Use String class constructor to create a sorted string from char array
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortStringMethod1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String outputString = sortString(inputString);

        System.out.println("Input string: " + inputString);
        System.out.println("Alphabetically sorted string: " + outputString);
    }

    public static String sortString(String inputString){

        // convert input string to char array
        char[] tempArr = inputString.toCharArray();

        // sort tempArr
        Arrays.sort(tempArr);

        return new String(tempArr);
    }
}
