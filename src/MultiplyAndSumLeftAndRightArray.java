/*
GeeksforGeeks Java Practice
Pitsy needs help in the given task by her teacher. The task is to divide a array into
two sub array (left and right) containing n/2 elements each and do the sum of the
subarrays and then multiply both the subarrays.
 */

import java.util.Scanner;

public class MultiplyAndSumLeftAndRightArray {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            ArrayOperation(arr, n);
        }
    }

    static void ArrayOperation(int[] arr, int n){
        int n1 = n/2;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < n1; i++){
            sum1 += arr[i];
        }

        for (int j = n1; j < n; j++){
            sum2 += arr[j];
        }
        System.out.println(sum1 * sum2);
    }
}

/*
Example:
Input:
2
4
1 2 3 4
3
4 5 6
Output:
21
44
 */