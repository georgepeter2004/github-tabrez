package Tabrezclass;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.println("1.circle\n2.rectangle\n3.triangle\n4.Exit\n");
            flag = true;
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.print("Enter Radius: ");
                    int r = sc.nextInt();
                    System.out.println("\nArea of Circle: "+ circle((double)r));
                    break;
                case 2:
                    System.out.print("\nEnter Breadth: ");
                    int b = sc.nextInt();
                    System.out.print("\nEnter Width: ");
                    int l = sc.nextInt();
                    System.out.println("\nArea of Rectangle: "+ rectangle(l,b));
                    break;
                case 3:
                    System.out.print("Enter Breadth: ");
                    int bb = sc.nextInt();
                    System.out.print("\nEnter Height: ");
                    int h = sc.nextInt();
                    System.out.println("\nArea of Rectangle: "+ triangle(bb,h));
                    break;
                case 4:
                    flag = false;
            }
        }while(flag);

    }

    static double circle(double r){
        return (Math.PI*(r*r));
    }

    static int rectangle(int l ,int b){
        return l*b;
    }

    static int triangle(int b,int h){
        return (b*h)/2;
    }
}
