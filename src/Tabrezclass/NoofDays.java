package Tabrezclass;

import java.util.Scanner;

public class NoofDays {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 7 == 1) {
            System.out.println("sunday");
        } else if (a % 7 == 2) {
            System.out.println("Monday");
        } else if (a % 7 == 3) {
            System.out.println("tuesday");
        } else if (a % 7 == 4) {
            System.out.println("wednesday");
        } else if (a % 7 == 5) {
            System.out.println("Thursday");
        } else if (a % 7 == 6) {
            System.out.println("Friday");
        } else if (a % 7 == 0) {
            System.out.println("Saturday");
        } else {
            System.out.println("invalid");
        }

    }
}
