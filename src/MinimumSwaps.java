import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int temp = 0;
        int count = 0;
        int n = arr.length / 2;
        int t = n;
        int sort = arr.length;
        int[] new_arr = new int[arr.length];

        while ( t--> 0){
            int[] l_arr = new int[n];
            int[] r_arr = new int[arr.length - n];

            for (int ii = 1; ii < n; ii++) {
                l_arr[ii] = arr[ii];
                l_arr[ii - 1] = arr[ii-1];
            }

            for (int i = 1; i < n; i++) {
                if (l_arr[i - 1] > l_arr[i]) {
                    temp = l_arr[i];
                    l_arr[i] = l_arr[i - 1];
                    l_arr[i - 1] = temp;
                    count += 1;
                }
            }

            for (int jj = n; jj < arr.length - 1; jj++) {
                r_arr[jj-n] = arr[jj];
                r_arr[jj-n+1] = arr[jj+1];
            }

            for (int j = n; j < r_arr.length - 1; j++) {
                if (r_arr[j] > r_arr[j + 1]) {
                    temp = r_arr[j + 1];
                    r_arr[j - n + 1] = r_arr[j];
                    r_arr[j - n] = temp;
                    count += 1;
                }
            }
            if (l_arr[l_arr.length-1] > r_arr[r_arr.length-1]){
                temp = r_arr[r_arr.length-1];
                r_arr[r_arr.length-1] = l_arr[l_arr.length-1];
                l_arr[l_arr.length-1] = temp;
                count += 1;
                for (int iter2 = 0; iter2 < l_arr.length; iter2++) {
                    for (int iter3 = 0; iter3 < r_arr.length; iter3++){
                        if (l_arr[iter2]>r_arr[iter3]){
                            temp = l_arr[iter2];
                            l_arr[iter2] = r_arr[iter3];
                            r_arr[iter3] = temp;
                            count += 1;
                        }
                    }
                }
            }

            if (l_arr[l_arr.length - 1] > r_arr[0]) {
                for (int iter1 = 0; iter1 < r_arr.length; iter1++) {
                    arr[iter1] = r_arr[iter1];
                }

                for (int iter2 = 0; iter2 < l_arr.length; iter2++) {
                    arr[iter2 + r_arr.length] = l_arr[iter2];
                }
                //count += 1;
            }
            else{
                for (int iter4 = 0; iter4 < l_arr.length; iter4++) {
                    arr[iter4] = l_arr[iter4];
                }
                for (int iter5 = n; iter5 < arr.length; iter5++) {
                    arr[iter5] = r_arr[iter5-n];
                }
            }

            new_arr[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (new_arr[i - 1] > arr[i]) {
                    temp = new_arr[i - 1];
                    new_arr[i - 1] = arr[i];
                    new_arr[i] = temp;
                    count += 1;
                } else {
                    new_arr[i] = arr[i];
                }
            }
            for (int iter = 0; iter < arr.length; iter++){
                arr[iter] = new_arr[iter];
            }
        }
        return count;
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
