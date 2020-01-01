//import java.math.*;

public class create_array {

    public static void main(String[] arg){
        int n = 5;
        double[] a; // declare array
        a = new double[n]; // create array

        // Populate array with for loop
        for (int i =0; i<n; i++){
            a[i] = Math.random();
            System.out.println(a[i]);
        }

    }
}
