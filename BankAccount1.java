//
//import java.util.Scanner;
//
//class Account {
//// Enter Your Code Here.
//
//    String name;
//    String code;
//    double balance;
//    boolean active;
//
//    public Account(String name, String code, double balance) {
//        this.name = name;
//        this.code = code;
//        this.balance = balance;
//        this.active = true;
//        System.out.println("Open account");
//    }
//    //method
//
//    //printInfo
//    void printInfo() {
//        String ac = (active == true) ? "active" : "inactive";
//        System.out.println(name + ", "
//                + code + ", " + balance + ", " + ac);
//    }
//
//    //checkBalance
//    double checkBalance() {
//        return balance;
//    }
//
//    //closeAccount
//    void closeAccount() {
//        this.active = false;
//        this.printInfo();
//    }
//
//    //deposit
//    boolean deposit(double bath) {
//        if (active) {
//            this.balance += bath;
//            System.out.print(this.checkBalance()+" ");
//            return true;
//        } else {
//            return false;
//        }
//    }
//    //withdrawn
//    boolean withdrawn(double bath){
//        if(active && (balance-bath>=0)){
//            balance -= bath;
//            System.out.print(this.checkBalance()+" ");
//            return true;
//        }else{
//            return false;
//        }
//    }
//}
//
//public class BankAccount1 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        String code = scan.nextLine();
//        double money = scan.nextDouble();
//        /* Your Code: create Account object*/
//        Account a = new Account(name, code, money);
//        int N = scan.nextInt();
//        for (int i = 0; i < N; ++i) {
//            /* Your Code */
//            int com = scan.nextInt();
//            if(com==1){
//                a.printInfo();
//            }
//            else if(com==2){
//                System.out.println(a.checkBalance());
//            }
//            else if(com==3){
//                a.closeAccount();
//            }
//            else if(com==4){
//                double bath = scan.nextDouble();
//                System.out.println(a.deposit(bath));
//            }
//            else if(com==5){
//                double bath = scan.nextDouble();
//                System.out.println(a.withdrawn(bath));
//            }
//        }
//    }
//
//}
