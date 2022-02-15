/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package simpleSortAlogrithms;

/**
 * An implementation of the simple sorting algo described here
 * https://arxiv.org/pdf/2110.01111.pdf
 */

public class ASimpleSortAlgo {
    public static void main(String[] args) {
        // Example array
        int[] valuesToBeSorted = 
        new int[]{6, 3, 4, 0, 1,3,4, 90, 1, 0, 2, 32};
        
        for (int i = 0; i < valuesToBeSorted.length; i++) {
            int temp = valuesToBeSorted[i];
            for (int j = 0; j < valuesToBeSorted.length; j++) {
                if (temp < valuesToBeSorted[j]) {
                    valuesToBeSorted[i] = valuesToBeSorted[j];
                    valuesToBeSorted[j] = temp;
                    temp = valuesToBeSorted[i];
                }
            }
        }
        for (int j : valuesToBeSorted) {
            System.out.println(j);
        }
    }
}
