/*
Hackerrank Java Practice
 left rotation operation on an array shifts each of the array's elements 1 unit to the left.
 For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2]

 Example:
 Input: n = 5,  d = 4
        1 2 3 4 5
 Output: 5 1 2 3 4
 */

import java.io.IOException;
import java.util.Scanner;

public class LeftArrayRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] new_a = new int[n];
        for (int i = 0; i < n; i++){
            int pos = i + (n - d) % n;
            if ( pos >= n){new_a[pos-n] = a[i];}
            else{new_a[pos] = a[i];}
        }

        return new_a;

    }


    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int d = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        scanner.close();
    }
}
