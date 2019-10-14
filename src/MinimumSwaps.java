import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int temp = 0;
        int count = 1;
        int n = (arr.length -1)/2 + 1;
        int[] l_arr = new int[n];
        int[] r_arr = new int[n];

        for (int i = 1; i < n; i++){
            if (arr[i-1] > arr[i]){
                temp= arr[i];
                l_arr[i] = arr[i-1];
                l_arr[i-1] = temp;
                count +=1;
            }
            else{
                l_arr[i-1] = arr[i-1];
                l_arr[i] = arr[i];
            }
        }

        for (int j = n; j < arr.length-1; j++){
            //r_arr[j-n] = arr[j];
            if (arr[j] > arr[j+1]){
                temp = arr[j+1];
                r_arr[j] = arr[j];
                r_arr[j] = temp;
                count +=1;
            }
            else{
                r_arr[j-n] = arr[j];
                r_arr[j+1-n] = arr[j+1];
            }
        }

        if (l_arr[n-1] > r_arr[0] ){
            int[] new_arr = new int[arr.length];
            for (int iter1 = 0; iter1 < n; iter1++){
                new_arr[iter1] = r_arr[iter1];
            }

            for (int iter2 = n; iter2 < arr.length; iter2++){
                new_arr[iter2] = l_arr[iter2 - n];
            }
            count += 1;
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
