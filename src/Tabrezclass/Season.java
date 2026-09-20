package Tabrezclass;

import java.util.Scanner;

public class Season {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 12 && a >= 1 && a <= 2) {
            System.out.println("Spring");
        } else if (a >= 9 && a <= 11) {
            System.out.println("Rainy");
        } else if (a >= 6 && a <= 8) {
            System.out.println("winter");
        }
        else if(a>=3 && a<=5){
            System.out.println("summer");
        }
    }
}
