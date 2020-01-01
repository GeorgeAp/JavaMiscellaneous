/*Given a matrix(2D array) M of size N*N consisting of 0s and 1s only.
The task is to find the column with maximum number of 0s.
 */

import java.util.Scanner;

public class ColumnWithMaxValue {

    public static void main(String[] args){
        // Taking input using scanner class
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while (testCase -- > 0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];

            for (int i = 0; i< n; i++){
                for (int j = 0; j< n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            EvalMatrix obj = new EvalMatrix();
            System.out.println();
        }
    }

}

class EvalMatrix{
    static int columnWithMaxZero(int[][] a, int n){
        int[] count = new int[n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (a[i][j] == 0)
                    count[j]++;
            }
        }

        int max = 0;
        int temp = 0;

        for (int k = 0; k < n; k++){
            if (max < count[k])
                max = count[k];
        }

        for (int t = 0; t < n; t++){
            if (count[t] == max)
                temp = t;
            break;
        }
        return temp;
    }
}

