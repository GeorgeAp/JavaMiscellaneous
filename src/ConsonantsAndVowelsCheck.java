import java.util.Scanner;

/*
You are given a string s containing only lowecase letters.
You need to count the number of vowels and the number of consonants.
If vowel count > consonant count then print - “Yes”(without quotes)
If vowel count < consonant count then print - “No”(without quotes)
If vowel count = consonant count then print - “Same”(without quotes)
 */
public class ConsonantsAndVowelsCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        boolean flag = false;

        while (t -- > 0){
            String s = sc.nextLine();
            TryJava obj = new TryJava();
            obj.checkString(s);
        }
    }
}

class TryJava{

    static void checkString(String s){
        int v = 0;
        int c = 0;

        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++){
            char new_s = s.charAt(i);
            if(new_s=='a' || new_s=='e'||new_s=='i' || new_s=='o' || new_s=='u'){
                v++;
            }
            else {
                c++;
            }
        }

        if (v > c)
            System.out.println("Yes");
        else if (v < c)
            System.out.println("No");
        else
            System.out.println("Same");

        System.out.println();

    }

}
