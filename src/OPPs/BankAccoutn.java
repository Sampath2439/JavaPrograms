package OPPs;

public class BankAccoutn {
    double balance;

    public BankAccoutn(double initalBalance){
        balance = initalBalance;
    }

    public void deposite(double amount){
        balance += amount;
        System.out.println("Cash Deposited : "+balance);
    }

    public void deposite(double amount, int cheque_number){
        balance += amount;
        System.out.println("Amoutn deposited by cheque number "+cheque_number+" is : "+amount);
    }

    public void deposite(double amount, String trasaction_ID, String bank_name){
        balance += amount;
        System.out.println("Deposited by online transfer (Txn ID: " + trasaction_ID + ", Bank: " + bank_name + "): ₹" + amount);
    }
    public void showbalance(){
        System.out.println("Current Balanve is : "+balance);
    }

    public static void main(String[] args) {
        BankAccoutn b1 = new BankAccoutn(5000);
        b1.deposite(5000);
        b1.deposite(2500,121);
        b1.deposite(4500,"451","BOB");
        b1.showbalance();
    }
}
