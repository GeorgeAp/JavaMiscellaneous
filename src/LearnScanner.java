import java.util.Scanner;
public class LearnScanner {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("What is your name");
        String name = input.next();
        System.out.println("Hello " + name);

    }
}
