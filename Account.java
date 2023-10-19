package practicals;

public class Account {
	String name,type;
	int no,bal;
	
	Account(String a,int b,int c,String d){
		name=a;
		no=b;
		bal=c;
		type=d;
	}
	
	int deposit(int x) {
		bal=bal+x;
		return(bal);
	}
	
	int withdraw(int y) {
		if(bal<y) {
			System.out.println("Not enough balance to withdraw");
		}
		else {
			System.out.println("withdraw sucessful");
			bal=bal-y;
		}
		return(bal);	
	}
	
	void display() {
		System.out.println("name="+name+" balance="+bal);
	}

}
