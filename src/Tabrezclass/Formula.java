package Tabrezclass;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Circle" +
                "\n2.Square" +
                "\n3.Rectangle" +
                "\nEnter Your Choice : ");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.print("\nEnter the radius: ");
                int a = sc.nextInt();
                System.out.println("circle:"+(Math.PI*(a*a)));
                break;
            case 2:
                System.out.print("\nEnter the side: ");
                a = sc.nextInt();
                System.out.println("Square:"+(a*a));
                break;
            case 3:
                System.out.print("\nEnter the Length: ");
                a = sc.nextInt();
                System.out.print("\nEnter the Breadth or width: ");
                int b = sc.nextInt();
                System.out.println("rectangle:"+(a*b));
                break;
        }

    }
}
