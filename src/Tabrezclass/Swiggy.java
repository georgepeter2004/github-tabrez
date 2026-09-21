package Tabrezclass;

import java.util.Scanner;

class Swiggy {
    static int db_uid;
    static int db_pwd;
    static long db_contact;
    static boolean acc_exists;
    static Scanner sc = new Scanner(System.in);
    static long OTP;
    static int db_qty;
    static int db_price = 0;

    public static void main(String[] args) throws Exception {

        boolean flag = false;
        do {
            flag = true;
            System.out.println("\t\t\t-----SWIGGY----");
            System.out.println("1.SignUp\n2.Login\n3.Forget Password\n4.Logout");
            System.out.print("Enter the Option: ");
            int ch = sc.nextInt();



            switch (ch) {
                case 1:
                    signUp();
                    break;
                case 2:
                    if (acc_exists) {
                        if (login()) {
                            do {
                                System.out.println("\n------Restaurant------");
                                System.out.println("1.A2B\n2.Bilal\n3.Buhari\n4.Hotel Paramount\n5.Previous Section");
                                System.out.print("Enter your Choice: ");
                                ch = sc.nextInt();
                                switch (ch){
                                    case 1:
                                        a2b();
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                        System.out.println("Redirecting....");
                                        Thread.sleep(2000);
                                        flag = false;
                                        break;
                                }
                            }while(flag);
                            flag = true;
                            break;
                        }
                    } else {
                        System.out.println("Create Account to Login");
                        break;
                    }

                case 3:
                    if (acc_exists) {
                        forgetPwd();
                        break;
                    } else {
                        System.out.println("First! Create a Account ");
                        break;
                    }

                case 4:
                    flag = false;
                    System.out.println("Thank you");
                    break;

            }


        } while (flag);

    }

    static void signUp() {
        if (!acc_exists) {
            System.out.print("Enter UID: ");
            db_uid = sc.nextInt();
            System.out.print("\nEnter pwd: ");
            db_pwd = sc.nextInt();
            System.out.print("\nEnter your registered mobile no: ");
            db_contact = sc.nextLong();

            acc_exists = true;
            return;
        } else {
            System.out.println("Account is Already exists");
            return;
        }
    }

    static boolean login() throws Exception {
        System.out.print("Enter uid: ");
        int uid = sc.nextInt();
        System.out.print("\nEnter pwd: ");
        int pwd = sc.nextInt();
        Thread.sleep(1000);
        if (uid == db_uid && pwd == db_pwd) {
            System.out.println("-----Login Successful----");
            return true;
        }
        System.out.println("Login Failed incorrect uid & pwd");
        return false;
    }

    static void forgetPwd() throws Exception {
        Thread.sleep(1000);
        if (doVerfication()) {
            System.out.print("\nEnter new pwd: ");
            db_pwd = sc.nextInt();
            System.out.println("\nPassword changed successfully...");
        } else {
            System.out.println("Cannot change Password Please verify your account...");
        }
    }

    static boolean doVerfication() throws Exception {
        System.out.println("----Verification required----");
        System.out.print("Enter your Registered Mobileno: ");
        long contact = sc.nextLong();
        Thread.sleep(1000);
        if (contact == db_contact) {
            System.out.println("Verification is successful ");
            if(OTP()) return true;
            else return false;
        }

        System.out.println("Verfication Failed! Please enter the Correct registered mobile number");
        return false;
    }

    static boolean OTP() throws Exception{
        OTP = (long) (Math.random() * 9999) / 2;
        System.out.println("OTP Sent...");
        Thread.sleep(2000);
        System.out.println("OTP Received: " + OTP);
        Thread.sleep(2000);
        System.out.print("Enter OTP: ");
        int otp = sc.nextInt();
        Thread.sleep(2000);

        if (otp == OTP) {
            System.out.print("Verification successful");
            return true;
        } else {
            System.out.println("OTP is not matched! Try Again..");
            return false;
        }
    }

    static void a2b() throws Exception{
        System.out.println("----a2b menu---");
        System.out.println("1.sambar rice \n2.paneer friedrice\n3.veg meals\n4.Order Confirm\n5.Previous Option");
        System.out.print("Enter your Food: ");
        int ch = sc.nextInt();
        boolean flag;
       switch (ch){
           case 1:

               db_price +=  quality(db_qty);
               System.out.println("Total amt:"+db_price);
               do{
                   flag = true;
                   System.out.println("1.Gpay\n2.phonepe\n3.Bhim Upi\n4.Previous Option");
                   System.out.println("Enter your choice: ");
                   ch = sc.nextInt();

                   switch(ch){
                       case 1:
                           paymentGateway(db_price,"Gpay");
                           break;
                   }
               }while(flag);
               break;
           case 2:
           case 3:
           case 4: flag = false;
       }
    }

    static int quality(int qty){
        System.out.print("Enter Quantity: ");
        db_qty = sc.nextInt();
       return  qty * 480;
    }

    static void paymentGateway(int p,String pl) throws Exception{
        System.out.println("-----payment process-----");
        System.out.print("Confirm Order (y/n): ");
        char ch = sc.next().charAt(0);
        Thread.sleep(3000);
        switch(ch){
            case 'y':
            case 'n':
                System.out.println("Payment Cancelled");
                return ;
        }
    }
}
