class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        super.displayInfo();
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawLimit) {
        super(accountNumber, balance);
        this.withdrawLimit = withdrawLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        super.displayInfo();
    }
}

class FixedDepositAccount extends BankAccount {
    private int durationInMonths;

    public FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        super.displayInfo();
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA1", 1000, 0.05);
        savingsAccount.displayAccountType();

        CheckingAccount checkingAccount = new CheckingAccount("CA1", 2000, 500);
        checkingAccount.displayAccountType();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA1", 3000, 12);
        fixedDepositAccount.displayAccountType();
    }
}
