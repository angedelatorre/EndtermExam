import javax.swing.JOptionPane;

public class AccountUnitTest {
	public AccountUnitTest() {
		
	}
	
	//@DisplayName ("Testing")
	//void method() {
			//Checking check = new Checking(1);
			//Savings save = new Savings(2, 1.6);
		//}
	
		public static void main(String[] args)
		{
			AccountForABank[] accountArray = new AccountForABank[10];
			
			accountArray[0] = new Checking(5);
			accountArray[1] = new Checking(20);
			accountArray[2] = new Checking(25);
			accountArray[3] = new Checking(30);
			accountArray[4] = new Checking(35);
			accountArray[5] = new Savings(10, 0.5);
			accountArray[6] = new Savings(20, 1.5);
			accountArray[7] = new Savings(30, 1.2);
			accountArray[8] = new Savings(40, 0.7);
			accountArray[9] = new Savings(50, 1.4);
		
			for(int i = 0; i < accountArray.length; ++i)
				System.out.println(accountArray[i].getAccountInfo() + "\n");
		}
	}
