package Tabrezclass;

public class Signal {
    public static void main(String[] args) {
        String n = "yellow";
        switch (n) {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "Green":
                System.out.println("LET'S GO!!!");
                break;
            default:
                System.out.println("Invalid Signal");
        }
    }
}
