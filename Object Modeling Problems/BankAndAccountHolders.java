import java.util.*;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;
    private int totalCustomers = 0;

    public Bank(String bankName) {
        this.bankName = bankName;                                      
        this.customers = new ArrayList<Customer>();
        this.accounts = new ArrayList<Account>();
    }

    public void addCustomer(Customer customer) {
        if(!customers.contains(customer)) {
            customers.add(customer);
            totalCustomers++;
        }
        else {
            System.out.println("Customer Already There");
        }
    }

    public Account openAccount(Customer customer, Account newAccount) {
        this.accounts.add(newAccount);
        return newAccount;
    }

    public void displayCustomers() {
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("        Bank Name: " + bankName);
        System.out.println("     Total Customers In Bank: " + totalCustomers);
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        for (Customer customer : customers) {
            customer.displayAllAccounts();
            System.out.println();    
        }
        System.out.println("***********************************************");
        System.out.println("***********************************************");
    }
}

class Account {
    private String accountNumber;
    private double balance;
    private final String accountType;

    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
    }
}

class Customer {
    private final String customerId;
    private String customerName;
    private ArrayList<Account> account;

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        account = new ArrayList<Account>();
    }

    public void requestNewAccount(Bank bank, Account newAccount) {
        if(!account.contains(newAccount)) {
            Account accountCreated = bank.openAccount(this, newAccount);
            this.account.add(accountCreated);
            System.out.println("Account Created");
        }
        else 
            System.out.println("Account Already Exists!");
    }

    public void viewBalance(Account newAccount) {
        if(account.contains(newAccount)) {
            System.out.println("***********************************************");
            System.out.println("Customer ID: " + customerId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("***********************************************");
            newAccount.display();
        }
        else 
            System.out.println("The Account you want to view is out of your Access Rights");
    }

    public void displayAllAccounts() {
        System.out.println("***********************************************");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("***********************************************");
        for (Account acc : account) {
            acc.display();
            System.out.println();
        }
        System.out.println("***********************************************");
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank1 = new Bank("SBI Bank");
        Bank bank2 = new Bank("Canara Bank");

        Customer customer1 = new Customer("C001", "Jessie Sharma");
        Customer customer2 = new Customer("C002", "Anil Bansal");
        Customer customer3 = new Customer("C003", "Neeraj Agarwal");

        bank1.addCustomer(customer1);
        bank2.addCustomer(customer2);
        bank1.addCustomer(customer3);
        
        Account acc1 = new Account("3889-3984-8948", 77000, "Savings");
        Account acc2 = new Account("3889-3984-8949", 5000, "Current");
        Account acc3 = new Account("4222-3425-5436", 170000, "Loan");
        Account acc4 = new Account("4222-3425-5437", 107680, "Savings");
        Account acc5 = new Account("9897-3567-6746", 7500000, "Savings");
        Account acc6 = new Account("8956-5623-5626", 1250564, "Current");

        customer1.requestNewAccount(bank1, acc1);
        customer1.requestNewAccount(bank1, acc2);
        customer2.requestNewAccount(bank2, acc3);
        customer2.requestNewAccount(bank1, acc4);
        customer3.requestNewAccount(bank2, acc5);
        customer3.requestNewAccount(bank2, acc6);

        customer1.displayAllAccounts();
        customer2.displayAllAccounts();
        customer3.displayAllAccounts();

        customer1.viewBalance(acc2);
        customer1.viewBalance(acc6);

        bank1.displayCustomers();
        bank2.displayCustomers();
    }
}
