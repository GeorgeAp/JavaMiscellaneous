package simpleSortAlogrithms;

/**
 * An implementation of the simple sorting algo described here
 * https://arxiv.org/pdf/2110.01111.pdf
 */

public class ASimpleSortAlgo {
    public static void main(String[] args) {
        // Example array
        int[] valuesToBeSorted = new int[]{6, 3, 4, 0, 1,3,4};
        for (int i = 0; i < valuesToBeSorted.length; i++) {
            int temp = valuesToBeSorted[i];
            for (int j = 0; j < valuesToBeSorted.length; j++) {
                if (temp < valuesToBeSorted[j]) {
                    valuesToBeSorted[i] = valuesToBeSorted[j];
                    valuesToBeSorted[j] = temp;
                }
            }
        }
        for (int j : valuesToBeSorted) {
            System.out.println(j);
        }
    }
}
