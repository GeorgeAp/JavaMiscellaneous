/*
Hackerrank Java Practice
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array
element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.
Example:
Input: m=3, n=5
     matrix- 1 2 100
             2 5 100
             3 4 100
Output: 200
 */
import java.util.Scanner;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];
        for (int i = 0; i < queries.length; i++){
            for (int j = 1; j < queries[0].length; j++){
                for (int iter = queries[i][j-1]-1; iter < queries[i][j]; iter++){
                    arr[iter] = arr[iter] + queries[i][queries[0].length-1];
                }
                break;
            }
        }

        int maxVal = 0;
        for (int val = 0; val < n; val++){
            if (arr[val] > maxVal){maxVal = arr[val];}
        }
        return maxVal;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nm = new int[]{5,3};

        for (int iter = 0; iter < 2; iter++){
            nm[iter] = scanner.nextInt();
        }

        int n = nm[0];
        int m = nm[1];

        int[][] queries = new int[m][3];
        //{{1, 2, 100},{2, 5, 100},{3, 4, 100}}

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = scanner.nextInt();
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        scanner.close();
    }
}
