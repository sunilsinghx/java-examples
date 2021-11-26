//Our Throw Default Catch
class OTDC
{
	public static void main(String args[]){
	int balance = 6000;
	int withdraw = 8000;

	if(balance < withdraw){
		throw new ArithmeticException("Insufficient Balance");	//creating new object and passing error message in constructor
		}
	balance = balance - withdraw;
	System.out.println("Transaction complete");
	System.out.println("program continues..");
	}
}