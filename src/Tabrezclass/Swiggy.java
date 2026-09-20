package Tabrezclass;

import java.util.Scanner;

 class Swiggy {
     static int db_uid;
     static int db_pwd;
     static long db_contact;
     static boolean acc_exists;
     static Scanner sc = new Scanner(System.in);
     static long OTP;
    public static void main(String[] args) throws Exception {

        boolean flag = false;
        do{
            System.out.println("\t\t\t-----SWIGGY----");
            System.out.println("1.SignUp\n2.Login\n3.Forget Password\n4.Logout");
            int ch = sc.nextInt();
            flag = true;
            switch(ch){
                case 1:
                    if(!acc_exists){
                        System.out.print("Enter UID: ");
                        db_uid = sc.nextInt();
                        System.out.print("\nEnter pwd: ");
                        db_pwd = sc.nextInt();
                        System.out.print("\nEnter your Contact no: ");
                        db_contact = sc.nextLong();
                        acc_exists = true;
                        break;
                    }
                    else {
                        System.out.println("Account is Already exists");
                        break;
                    }
                case 2:
                    if(acc_exists){
                        if(login()) {
                            break;
                        }
                        else {
                            System.out.println("Login failed");
                            break;
                        }
                    }
                    else{
                        System.out.println("Create Account to Login");
                    }

                case 3:
                  if(acc_exists) { forgetPwd(); break;}
                  else {System.out.println("Create a Account to use"); break;}

                case 4: flag = false;

            }
        }while (flag);

    }

    static boolean login(){
        if(acc_exists){
            System.out.print("Enter uid: ");
            int uid = sc.nextInt();
            System.out.println("\nEnter pwd: ");
            int pwd = sc.nextInt();
            if(uid == db_uid && pwd==db_pwd ){
                System.out.println("Login Successful");
                return true;
            }
        }

        return false;
    }

    static void forgetPwd() throws Exception{
        if(acc_exists){
        System.out.print("Enter your Contactno: ");
        long contact = sc.nextLong();
        if(contact == db_contact){
            System.out.println("Verification is successful ");
            OTP = (long)(Math.random()*9999)/2;
            Thread.sleep(2000);
            System.out.println("OTP Received: "+OTP);
            System.out.println("Enter OTP: ");
            int otp = sc.nextInt();

            if(otp == OTP){
                System.out.print("Enter the pwd: ");
                db_pwd = sc.nextInt();
                System.out.println("Password Changed");
                return;
            }
            else {
                System.out.println("OTP Failed...");
                return;
            }
        }}

    }
}
