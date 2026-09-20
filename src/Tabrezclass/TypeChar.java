package Tabrezclass;

import java.util.Scanner;

public class TypeChar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char aa = sc.next().charAt(0);
        if(aa>='A' && aa<='Z' || aa>='a' && aa<='z' ){
            System.out.println("alphabet");
        }
        else if(aa>='0' && aa<='9'){
            System.out.println("Number");
        }

        else{
            System.out.println("special Char");
        }
    }


}
