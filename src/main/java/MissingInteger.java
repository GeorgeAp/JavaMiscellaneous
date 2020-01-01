/*
Codility coding test
---Task description---
Write a function:
        class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
NB: my solution is not efficient yet, it did not pass all cases
 */
import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int output = 0;
        int[] newArray = new int[n];
        int j = 0;
        int checkSorted = 0;
        int checkNegative = 0;

        for (int i = 0; i < n-1; i++){

            if (A[i]-A[i+1] == -1){
                newArray[j] = A[i]+1;
                j += 1;
                checkSorted += 1;
            }
            else if (A[i] < 0){
                //System.out.print(1);
                checkNegative += 1;
            }

            else if (A[i]-A[i+1] > 1){
                newArray[j] = A[i]+1;
                j += 1;
            }
        }

        if (checkSorted == n-1){
            //System.out.print(A[n-1]+1);
            return A[n-1]+1;
        }

        if (checkNegative == n-1){
            //System.out.print(A[n-1]+1);
            return 1;
        }

        Arrays.sort(newArray);

        for (int k = 0; k < n-1; k++){
            if ((newArray[k]- newArray[k+1])<-1 && (newArray[k]!=0)){
                if (newArray[k]- newArray[k+1] ==-1){
                    output = 0;
                    //System.out.print(output);
                    return output;
                }
                else if ((newArray[k]- newArray[k+1])>0){
                    output = newArray[k+1]+1;
                    // System.out.print(output);
                    return output;
                }
                else{
                    output=newArray[k];
                    //   System.out.print(output);
                }
            }
        }
        return output;
    }
}
