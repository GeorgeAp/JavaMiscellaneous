/*
Hackerrank Java Practice
Given an array, A, of N integers, print each element in reverse order
as a single line of space-separated integers.

Example
Array size: 4
Input: 1 4 3 2
Output: 2 3 4 1
 */
import java.io.IOException;
import java.util.Scanner;

public class ArraysDS {
    static int[] reverseArray(int[] a) {
        int n = a.length;
        int i = 0;
        int[] newArray = new int[n];
        for (int b:a){
            newArray[n-1-i] = b;
            i += 1;
        }
        return newArray;

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int arrCount = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        //String[] arrItems = scanner.nextLine();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            //int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = Integer.parseInt(scanner.next());
        }

        int[] res = reverseArray(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
