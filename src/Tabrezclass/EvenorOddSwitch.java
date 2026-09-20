package Tabrezclass;

public class EvenorOddSwitch {
    public static void main(String[] args) {
        int a = 4;
        int ch = 0;
        if (a % 2 == 0) ch = 1;
        else ch = 0;
        switch (ch){
            case 1:
                System.out.println("Even");
                break;
            case 0:
                System.out.println("Odd");
                break;
        }
    }
}
