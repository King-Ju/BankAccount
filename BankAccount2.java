
import java.util.Scanner;

class Account {
// Enter Your Code Here.

    String name;
    String code;
    double balance;
    boolean active;

    public Account(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }
    //method

    //printInfo
    void printInfo() {
        String ac = (active == true) ? "active" : "inactive";
        System.out.println(name + ", "
                + code + ", " + balance + ", " + ac);
    }

    //checkBalance
    double checkBalance() {
        return balance;
    }

    //closeAccount
    void closeAccount() {
        this.active = false;
        this.printInfo();
    }

    //deposit
    boolean deposit(double bath) {
        if (active) {
            this.balance += bath;
            System.out.print(this.checkBalance() + " ");
            return true;
        } else {
            return false;
        }
    }

    //withdrawn
    boolean withdrawn(double bath) {
        if (active && (balance - bath >= 0)) {
            balance -= bath;
            System.out.print(this.checkBalance() + " ");
            return true;
        } else {
            return false;
        }
    }
}

class Saving extends Account {
// Enter Your Code Here.

    String id = "";
    String tel = "";
    boolean promptPay;

    public Saving(String name, String code, double balance) {
        super(name, code, balance);
        this.promptPay = false;
        System.out.println("Saving account");
    }

    @Override
    void printInfo() {
        super.printInfo();
        if (promptPay) {
            System.out.print("PromptPay");
            if (id.length() > 0) {
                System.out.print(", " + id);
            }
            if (tel.length() > 0) {
                System.out.print(", " + tel);
            }
            System.out.println("");
        } else {
            System.out.println("no PromptPay");
        }
    }

    boolean openPromptPay(int com, String pass) {

        if (com == 1) {
            if (pass.length() == 13) {
                id = pass;
                promptPay = true;
                return promptPay;
            } else {
                return false;
            }
        } else if (com == 2) {
            if (pass.length() == 10) {
                tel = pass;
                promptPay = true;
                return promptPay;
            } else {
                return false;
            }
        }
        return false;
    }

}

public class BankAccount2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        /* Your Code: create Saving object*/
        Saving harrySaving = new Saving(name, code, money);
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            int com = scan.nextInt();
            if (com == 1) {
                harrySaving.printInfo();
            } else if (com == 2) {
                System.out.println(harrySaving.checkBalance());
            } else if (com == 3) {
                harrySaving.closeAccount();
            } else if (com == 4) {
                double bath = scan.nextDouble();
                System.out.println(harrySaving.deposit(bath));
            } else if (com == 5) {
                double bath = scan.nextDouble();
                System.out.println(harrySaving.withdrawn(bath));
            } else if (com == 6) {
                int subMenu = scan.nextInt();
                String number = scan.next();
                System.out.println(harrySaving.openPromptPay(subMenu, number));
            }
        }
    }

}
