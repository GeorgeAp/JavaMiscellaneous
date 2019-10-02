/*
Hackerrank Java Coding Practice
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale
from 1 to 100 for three categories: problem clarity, originality, and difficulty.
We define the rating for Alice's challenge to be the triplet a = (a0, a1, a2), and the rating for Bob's challenge to be
 the triplet b = (b0, b1, b2).
Your task is to find their comparison points by comparing  a(i) with b(i).
If a(i) > b(i), then Alice is awarded  point.
If a(i) < b(i), then Bob is awarded  point.
If a(i) = b(i), then neither person receives a point.
Comparison points is the total points a person earned.
Determine their respective comparison points.
Example:
Input - 17 28 30
        99 16 8
Output - 2 1
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a,
                                         List<Integer> b) {
        List<Integer> result = new ArrayList();
        int aa = 0;
        int bb = 0;

        for (int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                aa +=1;
            }
            else if (a.get(i) < b.get(i)){
                bb += 1;
            }
            else{
                //aa = aa;
                //bb = bb;
            }
        }
        result.add(aa);
        result.add(bb);

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
