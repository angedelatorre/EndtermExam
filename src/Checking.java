
public class Checking extends AccountForABank {

	public Checking(int anum) {
		super (anum);
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return "Checking Account Info =" +  "\nAccount Number: " + getanum() + "\nBalance: " + getBalance();
	}

	void setMethod() {
		abalance = 0.0;
	}

	@Override
	String getAccountInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
