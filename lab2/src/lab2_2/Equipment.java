package lab2_2;

public class Equipment {
	
	public Equipment(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	private String name;
	private int amount;

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}