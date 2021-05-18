public class Savings extends AccountForABank {
	
	public Savings(int anum, double Interest) {
		super(anum);
		setInterest(Interest);
		// TODO Auto-generated constructor stub
	}

	private double interest;
	

	public void setInterest(double interest) {
		this.interest = interest;
	}


	@Override
	public int getanum() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String getAccountInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "\n Savings Account Info: " + "\nAccount Number: " + getanum() + "\nBalance: " + getBalance() + "Savings [interest=" + interest + "]";
	}
	




}