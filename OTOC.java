//Our Throw our Catch
class OTOC
{
	public static void main(String args[]){
	int balance = 6000;
	int withdraw = 8000;
	try{
		if(balance < withdraw){
		throw new ArithmeticException("Insufficient Balance");	//creating new object and passing error message in constructor
				     }
	balance = balance - withdraw;
	System.out.println("Transaction complete");
	}
	catch(ArithmeticException e){
		System.out.println("Exception : "+e.getMessage());
	}
	System.out.println("program continues..");	//program do not got terminated
	}
}