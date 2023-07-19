package day02.solved;
 class BankAcnt {
	 
    private String accNo;
    private String name;
    private double balance;
 
    public String getAccNo() {
        return accNo;
    }
 
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class TestBankAccount {
	 
    public static void main(String[] args) {
         
        //create Account
        BankAcnt acct1 = new BankAcnt();
        acct1.setAccNo("A101");
        acct1.setName( "Krishna" );
        acct1.setBalance(1000);
 
        System.out.println(acct1.getAccNo());
        System.out.println(acct1.getName());
        System.out.println(acct1.getBalance());
    }
}