package models;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;
	
	public VipCustomer() {
		this("John Dow", 100.00, "default@default.com");
		System.out.println("Empty Constructor!");
	}
	
	public VipCustomer(String name, String email) {
		this.name = name;
		this.creditLimit = 120.00;
		this.email = email;
		System.out.println("Contructor with 3 parameters!");
		
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	
}
