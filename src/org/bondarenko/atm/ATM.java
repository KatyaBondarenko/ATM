package org.bondarenko.atm;

public class ATM {
	Dispenser dispenser = new Dispenser();
	CardScanner cardScanner = new CardScanner();
	Keyboard keyboard = new Keyboard();
	
	public void startWork(){}
	public void completeWork(){}
	public void openAccount(){}
	public void verifyBalance(){}
	public void checkIDCard(){}
	public boolean checkPINCod(){
		return true;
	}
	public boolean checkLockCard(){
		return true;
	}
	public void lockCard(){}
	public void changeBalance() {}

	
	public static void main(String[] args) {
		

	}
}
