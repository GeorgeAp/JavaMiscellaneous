/*
Hackerrank Java Practice
Given people in a queue. Any person can just the queue by bribing at most 2 people.
Find the minimum number of bribes that has occurred in a given array

Example:

Input: 1  number of events
       5  size of array
       2 1 5 3 4

Output:
      3   minimum number of bribes that has occured
 */

import java.util.Scanner;

public class NewYearChaosProblem {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int num = 0;
        //int checkBribe = 0;
        for (int i = q.length - 1; i >=0; i--){
            if ((q[i] - (i+1)) > 2){
                System.out.println("Too chaotic");
                return;
            }

            for (int j = i+1; j < q.length; j++){
                if(q[i] > q[j]){
                    num += 1;
                    //checkBribe += 1;

                }
            }
            //checkBribe = 0;
        }
        System.out.println(num);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            int[] q = new int[n];

            for (int i = 0; i < n; i++) {
                q[i] = scanner.nextInt();
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
