import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rorateBy = sc.nextInt();

        while (rorateBy -- > 0){
            int N = sc.nextInt();
            int D = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i  < N; i++){
                arr[i] = sc.nextInt();
            }

            StringBuffer s = new StringBuffer();
            for (int j = D; j < N; j++){
                s.append(arr[j] + " ");
            }

            for (int t = 0; t < D; t++){
                s.append(arr[t] + " ");
            }

            System.out.println(s);
        }
    }
}

/*
Input example
2
5 2
1 2 3 4 5
10 3
2 4 6 8 10 12 14 16 18 20
 */
