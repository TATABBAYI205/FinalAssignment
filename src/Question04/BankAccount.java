package Question04;

public class BankAccount {
	
	int balance;
	String customerName;
	String CustomerId;
	
	public BankAccount(String customerName, String customerId) {
		super();
		this.customerName = customerName;
		this.CustomerId = customerId; 
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public String depositAmount(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			return "success";
		}
		return "failure";
	}

	public String withdrawAmount(Integer amount) {
		
		if(amount != 0) {
			balance = balance - amount;
			return "success";
		}
		else
			return "failure";
	}
	
}
