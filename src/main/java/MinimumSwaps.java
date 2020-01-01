/*
Hackerrank Java Practice
You are given an unordered array consisting of consecutive integers
Find the minimum number of swaps required to sort the array in ascending order.
Example:
Input: array size 7
       7 1 3 2 4 5 6

Output: 5 swaps
 */

import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static void swap(int[] array,int left, int right){
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    static int minimumSwaps(int[] arr) {
        int currentMin = 1;
        int currentInd = 0;
        int minSwapsCount = 0;
        while (currentMin != arr.length) {
            for (int i = currentInd; i < arr.length; i++) {
                if (arr[i] == currentMin) {
                    if (i == currentInd) {
                        currentInd++;
                        currentMin++;
                        break;
                    }
                    swap(arr, i, currentInd);
                    minSwapsCount++;
                    currentInd++;
                    currentMin++;
                }
            }
        }
        return minSwapsCount;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = minimumSwaps(arr);


        System.out.println(res);


        scanner.close();
    }
}
