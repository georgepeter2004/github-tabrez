package Tabrezclass;
import java.util.*;

public class Switchchr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(c>='0' && c<='9') System.out.println("Number");

        else if (c>='A' && c<='Z' || c>='a' && c<='z') {


            switch (c){
                case 'A','E','I','O','U','a','e','i','o','u':
                    System.out.println("Vowels");
                    break;
                default:
                    System.out.println("consonents");
            }
        }


        else System.out.println("special Char");



    }
}
