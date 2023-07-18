package day03.solved;
 class AccountDetails {
	 
    public String accNo;
 
    public String name;
 
    public double balance;
 
     
    public AccountDetails(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
     
 
}
public class TestAccountdet {
	 
    public static void main(String[] args) {
         
        //create Account
    	AccountDetails acct1 = new AccountDetails("A101", "Naresh" , 1000 );
        System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);
         
         
        //create Account
        AccountDetails acct2 = new AccountDetails("A102","Arun", 1000);
        System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);
    }
 
}
