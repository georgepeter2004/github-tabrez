package Tabrezclass;

import java.util.Scanner;

public class BasicProblems {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Prime number logic 1: "+prime1(8));
        System.out.println("Prime number logic 2: "+prime2(9));
        System.out.println("Prime number logic 3: "+prime3(9));

        System.out.println("count digit 1: "+countdigit1(456));
        System.out.println("count digit 2: "+countdigit2(456));

        System.out.println("sum of digit: "+sumofdigit(1234));

        nthMaximumMinimum(12314);

        System.out.println("Sum of First and Last Digit: "+sumofFirstnLastDigit(7897));

        System.out.println(xylem(1234)?"Xylem":"Phloem");

    }


    static boolean prime1(int n) {
        if (n == 0 || n == 1) return false;//loop is running from  2 to nth times
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean prime2(int n) {
        if (n == 0 || n == 1) return false;//loop is running from  2 to n/2 times looping reduced
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean prime3(int n) {
        if (n == 0 || n == 1) return false;//loop is running from 2 to root n which is more faster
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void nthMaximumMinimum(int n) {
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
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

    }

    static int countdigit1(int n){
        int count=0;
        for(int i=1;n>0;i++){
            count++;
            n/=10;
        }
        return count;//brute force
    }

    static int countdigit2(int n){
        return (int)Math.log10(n)+1;//optimal with in-build function
    }

    static int sumofdigit(int n){
        int digit = 0;
        while(n!=0){
            digit += n%10;
            n/=10;
        }
        return digit;
    }

    static int sumofFirstnLastDigit(int n){
        int first=0;
        int last=n%10;
        while(n>0){
            first = n%10;
            n/=10;
        }
        return first+last;
    }

    static boolean xylem(int n){
        int last = n%10;
        int middlesum=0;
        int first=0;
        n/=10;
        while(n>=10){
                middlesum +=n%10;
                n/=10;
        }
        first = n;
        return (first+last) == middlesum;
    }

}
