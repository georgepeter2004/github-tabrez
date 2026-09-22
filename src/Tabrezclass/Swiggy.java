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
                        if (login()) {//true or false
                            do {
                                System.out.println("\n------Restaurant------");
                                System.out.println("1.A2B\n2.Bilal\n3.Buhari\n4.Hotel Paramount\n5.Previous Section");
                                System.out.print("Enter your Choice: ");
                                ch = sc.nextInt();
                                switch (ch) {
                                    case 1:
                                        if (a2b()) {
                                            flag = false;
                                            System.out.println("Thank You!");
                                            return;
                                        }
                                        break;
                                    case 2:
                                        if (bilal()) {
                                            flag = false;
                                            System.out.println("Thank You!");
                                            return;
                                        }
                                        break;
                                    case 3:
                                        if (buhari()) {
                                            flag = false;
                                            System.out.println("Thank You!");
                                            return;
                                        }
                                        break;
                                    case 4:
                                        if (hotelParamount()) {
                                            flag = false;
                                            System.out.println("Thank You!");
                                            return;
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Redirecting....");
                                        Thread.sleep(1000);
                                        flag = false;
                                        break;
                                }
                            } while (flag);
                            flag = true;
                            break;
                        }
                        break;
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
                default:
                    System.out.println("Invalid Option");
                    break;

            }


        } while (flag);

    }

    static void signUp() throws Exception {
        if (!acc_exists) {
            System.out.print("Enter UID: ");
            db_uid = sc.nextInt();
            System.out.print("Enter pwd: ");
            db_pwd = sc.nextInt();
            System.out.print("Enter your registered mobile no: ");
            db_contact = sc.nextLong();
            acc_exists = true;
            Thread.sleep(1000);
            System.out.println("Account Created...");
            Thread.sleep(1000);
        } else {
            System.out.println("Account is Already exists");
        }
    }

    static boolean login() throws Exception {
        System.out.print("Enter uid: ");
        int uid = sc.nextInt();
        System.out.print("Enter pwd: ");
        int pwd = sc.nextInt();
        Thread.sleep(1000);
        if (uid == db_uid && pwd == db_pwd) {
            System.out.println("Login Successful.....\n\n");
            Thread.sleep(1000);
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
            if (OTP()) return true;
            else return false;
        }

        System.out.println("Verfication Failed! Please enter the Correct registered mobile number");
        return false;
    }

    static boolean OTP() throws Exception {
        OTP = (long) (Math.random() * 9999 + 9999) / 2;
        System.out.println("OTP Sent...");
        Thread.sleep(2000);
        System.out.println("OTP Received: " + OTP);
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

    static boolean a2b() throws Exception {

        boolean flag = false;
        do {
            flag = true;
            System.out.println("----a2b menu---");
            System.out.println("1.Sambar Rice\n2.Paneer Friedrice\n3.Veg Meals\n4.Order Confirm\n5.Previous Option");
            System.out.print("Enter your option: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    db_price += quality(db_qty, 220);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 2:
                    db_price += quality(db_qty, 320);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 3:
                    db_price += quality(db_qty, 200);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 4:
                    if (db_price != 0) {
                        if (upiPlatform()) return true;
                        else break;
                    } else {
                        System.out.println("Please ensure your food is selected in the cart");
                        break;
                    }

                case 5:

                    flag = false;
            }
        } while (flag);
        return false;
    }

    static boolean bilal() throws Exception {

        boolean flag = false;
        do {
            flag = true;
            System.out.println("----Bilal Menu---");
            System.out.println("1.Chicken Biryani\n2.Mandi\n3.Mutton Biryani\n4.Order Confirm\n5.Previous Option");
            System.out.print("Enter your option: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    db_price += quality(db_qty, 250);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 2:
                    db_price += quality(db_qty, 320);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 3:
                    db_price += quality(db_qty, 440);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 4:
                    if (db_price != 0) {
                        if (upiPlatform()) return true;
                        else break;
                    } else {
                        System.out.println("Please ensure your food is selected in the cart");
                        break;
                    }
                case 5:

                    flag = false;
            }
        } while (flag);
        return false;
    }

    static boolean buhari() throws Exception {

        boolean flag = false;
        do {
            flag = true;
            System.out.println("----Buhari menu---");
            System.out.println("1.Chicken Biryani\n2.Mutton Biryani\n3.Prawn Biryani\n4.Order Confirm\n5.Previous Option");
            System.out.print("Enter your option: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    db_price += quality(db_qty, 300);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 2:
                    db_price += quality(db_qty, 520);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 3:
                    db_price += quality(db_qty, 600);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 4:
                    if (db_price != 0) {
                        if (upiPlatform()) return true;
                        else break;
                    } else {
                        System.out.println("Please ensure your food is selected in the cart");
                        break;
                    }

                case 5:
                    flag = false;
            }
        } while (flag);
        return false;
    }

    static boolean hotelParamount() throws Exception {

        boolean flag = false;
        do {
            flag = true;
            System.out.println("----Hotel Paramount menu---");
            System.out.println("1.Chicken Mugal Biryani\n2.Chicken Plate Shavarma\n3.Barbeque\n4.Order Confirm\n5.Previous Option");
            System.out.print("Enter your option: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    db_price += quality(db_qty, 360);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 2:
                    db_price += quality(db_qty, 170);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 3:
                    db_price += quality(db_qty, 460);
                    System.out.println("Total amount:" + db_price);
                    break;
                case 4:
                    if (db_price != 0) {
                        if (upiPlatform()) return true;
                        else break;
                    } else {
                        System.out.println("Please ensure your food is selected in the cart");
                        break;
                    }

                case 5:
                    flag = false;
            }
        } while (flag);
        return false;
    }

    static int quality(int qty, int rate) {
        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();
        return qty * rate;
    }


    static Boolean upiPlatform() throws Exception {
        boolean flag = true;
        do {
            System.out.println("1.Gpay\n2.phonepe\n3.Bhim Upi\n4.Previous Option");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    return paymentGateway(db_price, "Gpay");
                case 2:
                    return paymentGateway(db_price, "Phonepe");
                case 3:
                    return paymentGateway(db_price, "Bhim Upi");
                case 4:
                    flag = false;
                    break;
            }
        } while (flag);
        return false;
    }

    static boolean paymentGateway(int p, String pl) throws Exception {
        boolean flag = false;
        do {
            System.out.println("-----payment process-----");
            if (doVerfication()) {
                Thread.sleep(1000);
                do{
                    System.out.println("\nTotal Amount: " + p + "\nPayment Gateway: " + pl);
                    System.out.print("Enter Amount :");
                    int amt = sc.nextInt();
                    if (amt == db_price) {
                        Thread.sleep(2000);
                        System.out.printf("\nOrder Amount :%d (y/n) Confirm :", p);
                        char ch = sc.next().charAt(0);
                        switch (ch) {
                            case 'y':
                                System.out.println("Order Placed");
                                db_price = 0;
                                return true;
                            case 'n':
                                System.out.println("Order Cancelled");
                                db_price = 0;
                                return true;
                            default:
                                flag = true;
                                System.out.println("Invalid option.Try again!");
                                break;
                        }
                    } else {
                        System.out.println("Entered amount is not Matched");
                        flag = true;
                    }
                }while(flag);
            }
        } while (flag);
        return false;
    }
}
