package Tabrezclass;

import java.util.Scanner;

public class AritmeticOperation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter 1st value: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd value: ");
        int b = sc.nextInt();
        System.out.println("choose any one +,-,*,/:");
        char ch = sc.next().charAt(0);
        sc.close();

        switch (ch){
            case '+':
                System.out.println("Add:"+(a+b));
                break;
            case '-':
                System.out.println("Sub:"+(a-b));
                break;
            case '*':
                System.out.println("Multiply:"+(a*b));
                break;
            case '/':
                System.out.println("Divide:"+(a/b));
                break;
        }
    }

}
