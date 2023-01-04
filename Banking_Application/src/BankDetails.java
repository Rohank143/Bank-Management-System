import java.util.Scanner;

public class BankDetails {

	
	private String Acno;
	private String name;
	private String Ac_type;
	private long balance;
	
	Scanner sc= new Scanner(System.in);
	
	public void openAccount() {
		System.out.print("Enter Account No: ");  
        Acno = sc.next();  
        System.out.print("Enter Account type: ");  
        Ac_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong(); 
	}
	
	public void showAccount() {
		System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + Acno);  
        System.out.println("Account type: " + Ac_type);  
        System.out.println("Balance: " + balance);  
	}
	
	public void deposit() {
		 long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt; 
	}
	
	public void withdrawl() {
		 long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	}
	
	  public boolean search(String ac_no) {  
	        if (Acno.equals(ac_no)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	    }  
}
