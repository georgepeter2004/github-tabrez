import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1234;
        int last = n%10;
        int first = 0 ;
        int middlesum = 0,extremesum;

        n/=10;
        while(n>=10){
            middlesum +=n%10;
            n/=10;
        }
        first = n;
        extremesum = first+last;
        System.out.println(extremesum==middlesum);
    }

}