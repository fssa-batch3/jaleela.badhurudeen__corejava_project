/*
 * Create an implementation of the Below Interface

```java
// Change the below class to have setters and Getters and Constructors
class Account  {
	String accNo;
	double balance;
	
}

//Create an implementation of the below Interface
public interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance();
}
```

Task#1: Create an AxisATM implementation which will have withdrawal charges of 5 rupees. If the balance is less than 5000, the withdraw method should throw and exception

Task#2: Create an IciciATM implementation which will have withdrawal charges of 10 rupees.

If the balance is less than 10000, the withdraw method should throw and exception

Implement the Deposit method which is common for all the Banks.
 * 
 */


package day05.practice;

class Account {
	String accNo;
	double balance;
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
// interface
interface ATM {
	boolean deposit(Account account, double amount);
	boolean withdraw(Account account, double amount) throws Exception;
	double getBalance();
}

// code for Axis Bank ATM 
class AxisATM implements ATM {
	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		return true;
	}
	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 5000) {
			throw new Exception("You have insufficient balance");
		}
		double amountwithdraw = amount + 5;
		if (account.balance >= amountwithdraw) {
			account.balance -= amountwithdraw;
			return true;
		} else {
			throw new Exception("You have insufficient balance");
		}
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}
}
//  code for Axis Bank ATM 
class IciciATM implements ATM {
	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		return true;
	}
	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 10000) {
			throw new Exception("You have insufficient balance");
		}
		double amountwithdraw = amount + 10;
		if (account.balance >= amountwithdraw) {
			account.balance -= amountwithdraw;
			return true;
		} else {
			throw new Exception("You have insufficient balance");
		}
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}
}
// test
public class TestAccount {
	public static void main(String[] args) {
		// 1
		Account axisaccount = new Account("IOB122345", 5000);
		ATM axisAtm = new AxisATM();
		try {
			axisAtm.withdraw(axisaccount, 3000);
			System.out.println(axisaccount.getBalance());
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
		// 2
		Account iciciATMaccount = new Account("Indian12345678", 10000);
		ATM iciciATM = new IciciATM();
		try {
			iciciATM.withdraw(iciciATMaccount, 4500);
			System.out.println(iciciATMaccount.getBalance());
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
		axisAtm.deposit(axisaccount, 2000);
		System.out.println(axisaccount.getBalance());
		iciciATM.deposit(iciciATMaccount, 2000);
		System.out.println(iciciATMaccount.getBalance());
	}
}