package objs;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String phone;
	private String email;
	
	
	public BankAccount() {
		this(1234, 10.00, "John", "default@yahoo.com", "(604)123 4567");
		System.out.println("Constroctor was created");
	}
	
	// Better to update values directly when within the class rather then using the Setters and Getters.
	public BankAccount(int accountNumber, double balance, String customName, String phone, String email) {
		System.out.println("Constroctor was created");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	public void deposit(double value) {
		System.out.println(getBalance() + " - " + value);
		if(this.balance - value < 0) {
			System.out.println("Insuficient funds, you only have " + this.balance + " in your bank account!");
		} else {
			this.balance -= value;
			System.out.println("Withdrawal ammount of "+ value+ " was concluded.");
			System.out.println("You have "+ this.balance+ " remaining in your account.");
		}
	}
	
	public void withdraw(double value) {
		System.out.println(getBalance() + " + " + value);
		this.balance += value;
		System.out.println(getBalance());
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
