package Exercise178;

public class Account {
	Integer number;
	String Holder;
	Double Balance;
	Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.Holder = holder;
		this.Balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

//methods
	public void Deposit(Double amount) {
		this.Balance += amount;
	}

	public void Withdraw(Double amount) {
		if (this.withdrawLimit >= amount && this.Balance >= amount) {
			this.Balance -= amount;
			System.out.println("New balance: " + this.Balance);
		} else if (this.Balance < amount) {
			System.out.println("Withdraw error: Not enough balance");
		} else {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		}

	}

}
