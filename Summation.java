package Github;

public class Summation {
    public static void main(String[]args){
        int a=0;

        //USING FOR LOOP
        for (int i=1;i<=10;i++){
            a=a+i;
        }System.out.println("The Sum of first 10 natural number :"+a);

        //USING WHILE LOOP
        int b=0;
        int j=1;
        while(j<=10){
            b=b+j;
            j++;
        }
        System.out.println("The Sum of first 10 natural number :"+a);
    }
}
