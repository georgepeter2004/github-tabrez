package Tabrezclass;
import java.util.Scanner;

public class user {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.print("Enter the start value: ");
//        int a=sc.nextInt();
//        System.out.print("\n Enter the End value:");
//        int b = sc.nextInt();
//        solve(a,b);

        int a=sc.nextInt();
        int r = sumofn(a);
        System.out.println(r);
    }

    public static void solve(int s , int e){
        for (int i=s;s<=e;s++){
            System.out.print(s+" ");
        }
    }

    public static int sumofn(int n){
        int sum=0;
        for (int i = 1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
