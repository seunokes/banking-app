package seunBA;
import java.util.Scanner;
public class seun_BA {

	public static void main(String[] args) {
		
        BankAccount obj = new BankAccount("okesanya seun", "SL00001"); 
        obj.showMenu(); 
	}

}
class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
    BankAccount(String cname, String cid){ 
    	customerName = cname;
    	customerID=cid;
    }
    
    
    
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;    
		} 
	}

    void withdraw (int amount) {
    	if (amount !=0) {
    		balance = balance + amount;
 			previousTransaction = -amount;    
    	}
    }
    void getPreviousTransaction() {
    	if(previousTransaction > 0) {
    		System.out.println("Deposited: " + previousTransaction);
    	}
    	else if(previousTransaction < 0) {
    		System.out.println("withdraw: " +Math.abs(previousTransaction));
    	}   
    	else {
    		System.out.println("no transaction occured");
    	}
    }
    
    void showMenu() {
    	
    	char option = '\0';
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Welcome" +customerName);
    	System.out.println("your ID " +customerID);
    	System.out.println("\n");

    	System.out.println("A: check your balance");
    	System.out.println("B: Deposit");
    	System.out.println("c: Withdraw");
    	System.out.println("D: previous Transaction");
    	System.out.println("E: Exit The System");

        do {
        	System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        	System.out.println("Enter your option");
        	System.out.println("==========================================================================");
        	option = scanner.next().charAt(0);
        	System.out.println("\n");
        	
        	switch (option) {
        	
        	case 'A':
        		System.out.println("----------------------------------------------------");  
        		System.out.println("Balance ="+balance);
        		System.out.println("****************************************************"); 
        		System.out.println("\n");
        		break;
        		
        	case 'B':
        		System.out.println("----------------------------------------------------");  
        		System.out.println("Enter an amount to deposit");
        		System.out.println("****************************************************");
        		
        		int amount = scanner.nextInt();
        		deposit(amount);
        		System.out.println("\n");
        		break;
        		
        	case 'C':
        		System.out.println("----------------------------------------------------");  
        		System.out.println("Enter an amount to withdraw");
        		System.out.println("****************************************************");
        		
        		int amount2 = scanner.nextInt();
        		withdraw(amount2);
        		System.out.println("\n");
        		break;
        		
        	case 'D':
        		System.out.println("----------------------------------------------------");  
        	    getPreviousTransaction();
        		System.out.println("****************************************************");
        		System.out.println("\n");
        		break;
        	
        	case 'E':
        		System.out.println("----------------------------------------------------");  
        		break;
        		
            default:
            	System.out.println("Invalid Option!! Please Enter correct Option");
            	break;
        	}
        }
        while(option != 'E');
            System.out.println("Thank you for using our service");
    }
}


 







