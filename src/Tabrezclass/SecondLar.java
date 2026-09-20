package Tabrezclass;
import java.util.Scanner;

public class SecondLar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a > b && a > c && a > d) {
            if (b > c && b > d) System.out.println(b);
            else if (c > d) System.out.println(c);
            else System.out.println(d);
        }


        else if (b > c && b > d ) {
            if(c>a && c>d) System.out.println(c);
            else if(a>d) System.out.println(a);
            else System.out.println(d);
        }



        else if (c > d) {
            if(d>a && d>b) System.out.println(d);
            else if (a>b) System.out.println(a);
            else System.out.println(b);
        }


        else {
            if(a>b && a>c) System.out.println(a);
            else if (b>c) System.out.println(b);
            else System.out.println(c);
        }

    }
}
