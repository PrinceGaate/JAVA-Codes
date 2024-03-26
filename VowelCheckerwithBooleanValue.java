package Functions;

import java.util.Scanner;
public class VowelCheckerwithBooleanValue {
    static boolean logic(char user){
        switch(user){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                System.out.println("It is an Vowel");
                return true;
            }
            default:{
                System.out.println("It is not an vowel");
                return false;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Character");
        char userinput=sc.next().charAt(0);
        boolean input=logic(userinput);
    }
}
