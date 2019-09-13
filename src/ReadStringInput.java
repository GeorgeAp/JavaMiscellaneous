import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStringInput {

    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String s = br.readLine();
            for (String str: s.split(" ")){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
