import java.util.Scanner;

/*
GeeksforGeeks Java Practice
Given an array arr[] of N non-negative integers representing height
of blocks at index i as Ai where the width of each block is 1.
Compute how much water can be trapped in between blocks after raining.
 */
public class TrappingRainWaterProblem {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a -- > 0){

            int sizeArr = sc.nextInt();

            int[] arr = new int[sizeArr];

            for (int i = 0; i < sizeArr; i++){
                arr[i] = sc.nextInt();
            }

            int[] left = new int[sizeArr];
            int[] right = new int[sizeArr];
            left[0] = arr[0];
            right[sizeArr-1] = arr[sizeArr-1];

            for (int j = 1; j < sizeArr; j++){
                left[j] = Math.max(left[j-1], arr[j]);
            }

            for (int k = sizeArr-2; k >= 0; k--){
                right[k] = Math.max(right[k+1], arr[k]);
            }

            int water = 0;
            for (int iter = 0; iter < sizeArr; iter++){
                water += Math.min(left[iter], right[iter]) - arr[iter];
            }

            System.out.println(water);

        }

    }
}

/*
Example:
Input:
2
4
7 4 0 9
3
6 9 9

Output:
10
0
 */

/*
How to think about this solution
An element of the array can store water if there are higher bars on left and right.
We can find the amount of water to be stored in every element by finding the heights
of bars on left and right sides. The idea is to compute the amount of water that
can be stored in every element of array. For example, consider the array {3, 0, 0, 2, 0, 4},
we can store three units of water at indexes 1 and 2, and one unit of water at index 3,
and three units of water at index 4.

A Simple Solution is to traverse every array element and find the highest bars on left and
right sides. Take the smaller of two heights. The difference between the smaller height and
height of the current element is the amount of water that can be stored in this array element.
Time complexity of this solution is O(n2).
 */
