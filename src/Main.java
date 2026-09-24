import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        int n = 18;
//        boolean isprime = false;
//
//        for(int i=2;i<=n);i++){
//            if(n%i==0){
//                isprime = false;
//                break;
//            }
//            isprime = true;
//        }
//
//        if(isprime) System.out.println("Prime Number");
//        else System.out.println("Not Prime Number");


        System.out.println(sumofdigit(5555));
    }

    static boolean primen(int n) {
        if (n == 0 || n == 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void nmaxmin(int n) {
        int max=n%10;
        int min=n%10;
        while(n>0){
            int d = n%10;

            if(d>max){
                max = d;
            }
            else if(d<min){
                min = d;
            }
            n/=10;
        }
        System.out.println(max);
        System.out.println(min);

    }

    static int countdigit(int n){
        int count=0;
        for(int i=n;i>0;i--){
            count++;
            i/=10;
        }
        return count;
    }

    static int sumofdigit(int n){
        int digit = 0;
        while(n!=0){
            digit = digit + n%10;
            n/=10;
        }
        return digit;
    }

}