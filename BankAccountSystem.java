class BankAccount {
	private String accountHolderName;
	private final String accountNumber;
	private static int totalAccounts = 0;
	protected static String bankName;
	
	BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccounts++;
	}

	BankAccount() {
		this.accountHolderName = "Anonymous";
		this.accountNumber = "0000-0000-0000-0000";
		totalAccounts++;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public void display() {
		System.out.println("Bank: " + bankName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
	}
}

public class BankAccountSystem {
	public static void main(String[] args) {
		BankAccount.bankName = "Canara Bank";
		BankAccount account1 = new BankAccount("Naman Kumar", "2488-1377-6484-1281");
		if(account1 instanceof BankAccount)
			account1.display();
		BankAccount account2 = new BankAccount("Chritij Jain", "7899-5585-4184-2201");
		if(account2 instanceof BankAccount)
			account2.display();
		BankAccount account3 = new BankAccount("Vaishali", "9897-6544-8208-1443");
		if(account3 instanceof BankAccount)
			account3.display();
		BankAccount account4 = new BankAccount();
		if(account4 instanceof BankAccount)
			account4.display();
		int totalAccounts = BankAccount.getTotalAccounts();
		System.out.println("Total Accounts in Canara Bank: " + totalAccounts);
	}
}