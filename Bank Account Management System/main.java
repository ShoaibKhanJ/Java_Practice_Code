class BankAccount{
    String name;
    double balance
    ;


    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    void deposit(double deposit){
        this.balance = this.balance + deposit;
    }

    void withdraw(double withdraw) {
    if (withdraw <= 0) {
        System.out.println("Withdrawal amount must be positive");
    } else if (withdraw > balance) {
        System.out.println("Insufficient Balance");
    } else {
        this.balance = this.balance - withdraw;
        System.out.println("Withdrawal successful");
    }
}

    void displayaccount(){
        System.out.println("Holder's Name: "+ name);
        System.out.println("Current Balance: "+ balance);
    }
}

class main{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Shoaib Khan", 500000);
        BankAccount b2 = new BankAccount("Ali", 100000);
    
        b1.deposit(5000);
        b2.withdraw(5000);

        b1.displayaccount();
        System.out.println("-------------------------------------------------------");
        b2.displayaccount();
    }
}