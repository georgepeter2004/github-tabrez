import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = 13;
        boolean isprime = false;

        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime = false;
                break;
            }
            isprime = true;
        }

        if(isprime) System.out.println("Prime Number");
        else System.out.println("Not Prime Number");
    }


}