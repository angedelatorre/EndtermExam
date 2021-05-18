
public abstract class AccountForABank {
	public int anum;
	public double abalance;
	
	public AccountForABank (int anum) {
		
		this.setAbalance(0.0);
		this.anum = anum;
		
}
	public void setAbalance(double abalance) {
		
		this.abalance = abalance;
		
	}
	
	public abstract int getanum();
	public abstract double getBalance();
	abstract String getAccountInfo();
	abstract void setMethod();
}
