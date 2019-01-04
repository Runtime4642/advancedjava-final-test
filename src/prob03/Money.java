package prob03;

public class Money {

	private int amount;
    
	public Money(int amount)
	{
		this.amount=amount;
	}
	public int add(Money other)
	{
		return this.amount + other.amount;
	}
	public int minus(Money other)
	{
		return this.amount - other.amount;
	}
	public int multiply(Money other)
	{
		return this.amount * other.amount;
	}
	public int devide(Money other)
	{
		return this.amount / other.amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		int other = (Integer) obj;
		if (amount != other)
			return false;
		return true;
	}

    
}
