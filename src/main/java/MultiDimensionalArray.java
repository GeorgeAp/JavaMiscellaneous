public class MultiDimensionalArray {

    public static void main(String[] args){

        // declaring and initializing 2D array
        int[][] arr = {{2, 7, 9, 1}, {3, 6, 1, 2}, {7, 4, 2, 3}};
        //System.out.println(arr.length);

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
