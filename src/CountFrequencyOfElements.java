/*
This is a coding test from GeeksforGeeks
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountFrequencyOfElements {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            // Declaring Arraylist
            ArrayList<Character> clist = new ArrayList<Character>();

            int q = sc.nextInt();

            // Looping for queries
            while (q-- > 0){
                char ch = sc.next().charAt(0);
                TaskHadler obj  = new TaskHadler();

                if (ch == 'i'){
                    char c = sc.next().charAt(0);
                    obj.insert(clist, c);
                }

                if (ch == 'f'){
                    char c = sc.next().charAt(0);
                    obj.freq(clist, c);
                }

            }
        }
    }

}

class TaskHadler {
    public static void insert(ArrayList<Character> clist, char c){
        clist.add(c);
    }

    public static void freq(ArrayList<Character> clist, char c){
        if (clist.contains(c)){
            System.out.println(Collections.frequency(clist, c));
        }
        else{
            System.out.println("Not present");
        }
    }
}


/*
Test case input:
2
6
i g i e i e i k i s f e
4
i c i p i p f f
 */