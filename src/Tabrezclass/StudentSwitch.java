package Tabrezclass;

public class StudentSwitch {
    public static void main(String[] args) {
        char ch = 'A';

        switch(ch){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
