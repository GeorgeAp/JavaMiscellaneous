import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArrays {
    static int hourglassSum(int[][] arr) {
        int[][] newArr = new int[arr.length-2][arr.length-2];
        int k = 0;
        int sum = 0;
        int j = 0;
            for (int i = 3; i< arr[0].length; i++){
            //for (int j = 0; j < arr.length-2; j++){
            int a = arr[i-3][j];
            int b = arr[i-3][j+1];
            int c = arr[i-3][j+2];

            // }
            int d = arr[i-2][j+1];

            int aa = arr[i-1][j];
            int bb = arr[i-1][j+1];
            int cc = arr[i-1][j+2];

            sum = a+b+c+d+aa+bb+cc;
            newArr[i-3][j]=sum;


            j += 1;
            k += 1;
            if (k == 2){break;}

        }
        int max = 0;
            for (int iter1 = 0; iter1 < newArr[0].length; iter1++){
            for (int iter2 = 0; iter2 < newArr.length; iter2++){
                if (max < newArr[iter2][iter1]){max=newArr[iter2][iter1];}
            }
        }

            return max;
    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            int result = hourglassSum(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }

}
