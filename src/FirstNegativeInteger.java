import java.util.Scanner;

/*
GeeksforGeeks Java Practice
Given an array and a positive integer k, find the first negative
integer for each and every window(contiguous subarray) of size k.
 */
public class FirstNegativeInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int dim = sc.nextInt();

            findNegativeInt(arr, n, dim);
        }
    }

    static void findNegativeInt(int[] arr, int n, int dim){
        boolean flag;

        for (int i = 0; i < n - dim + 1; i++){
            flag = false;
            for (int j = 0; j < dim; j++){
                if (arr[i+j] < 0){
                    System.out.print(arr[i+j] + " ");
                    flag = true;
                    break;
                }
            }

            if (!flag){
                System.out.print(0 + " ");
            }
        }
        System.out.println(" ");
    }
}


/*
Example:
Input:
2
5
-8 2 3 -6 10
2
8
12 -1 -7 8 -15 30 16 28
3

Output:
-8 0 -6 -6
-1 -1 -7 -15 -15 0
 */