package Tabrezclass;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine();

        switch (a){
            case "blue" :
                System.out.println("blue colour");
            case "orange" :
                System.out.println("orange colour");
            case "white":
                System.out.println("White colour");
            default:
                System.out.println("invalid colour");
        }



    }
}