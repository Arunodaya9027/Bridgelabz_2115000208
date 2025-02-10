interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {return accountNumber;}
    public String getHolderName() {return holderName;}
    public double getBalance() {return balance;}

    public void deposit(double amount) {
        if (amount > 0) 
            this.balance += amount;
        else 
            System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount) {
        if (amount > this.balance) 
            System.out.println("Insufficient balance");
        else if (amount <= 0) 
            System.out.println("Invalid withdrawal amount");
        else 
            this.balance -= amount;
    }

    public abstract double calculateInterest();

    public void display() {
        System.out.println();
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Balance: " + getBalance());
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * this.interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) 
            System.out.println("Loan application has submitted for Savings Account");
        else 
            System.out.println("Loan application rejected for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;

    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * this.interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) 
            System.out.println("Loan application has submitted for Current Account");
        else 
            System.out.println("Loan application rejected for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 5000, 0.05);
        savingsAccount.display();
        System.out.println("Interest: " + savingsAccount.calculateInterest());
        System.out.println("Loan Takenable Capacity: " + savingsAccount.calculateLoanEligibility());
        savingsAccount.applyForLoan(20000);

        CurrentAccount currentAccount = new CurrentAccount("CA123", "Bob", 10000, 0.03);
        currentAccount.display();
        System.out.println("Interest: " + currentAccount.calculateInterest());
        System.out.println("Loan Takenable Capacity: " + currentAccount.calculateLoanEligibility());
        currentAccount.applyForLoan(18000);
    }
}