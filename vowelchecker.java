package Github;

import java.util.*;
public class vowelchecker {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any Character :");
        String src=sc.nextLine();
        char ch = src.charAt(0);
        switch (Character.toLowerCase(ch)){
            case 'a':
                System.out.println("a is an Vowel");
                break;
            case 'e':
                System.out.println("e is an Vowel");
                break;
            case 'i':
                System.out.println("i is an Vowel");
                break;
            case 'o':
                System.out.println("o is an Vowel");
                break;
            case 'u':
                System.out.println("u is an Vowel");
                break;
            default:
                System.out.println("It is not an Vowel");
        }

    }
}
