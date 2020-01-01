import java.util.Arrays;
import java.util.Scanner;

/*
GeeksforGeeks Java Practice
Given an array arr[] and a number K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array.
It is given that all array elements are distinct.
 */
public class KthSmallestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a -- > 0){
            int b = sc.nextInt();
            int[] arr = new int[b];

            for (int i = 0; i < b; i++){
                arr[i] = sc.nextInt();
            }

            int kth = sc.nextInt();

            Arrays.sort(arr);
            System.out.println(arr[(kth-1)]);
        }
    }
}

/*
Example:
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4

Output:
7
15
 */