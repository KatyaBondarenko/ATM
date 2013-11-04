package org.bondarenko.atm;

public class Screen {
	private static String message ;
	public static void showMenu(){
		System.out.println("ATM menu: 1 - check account; 2 - get cash");
	}
	public static void showAccountStatus(long accountNumber, double sum){}
	public static void showMessage(){
		System.out.println("Messege: " + message);
	}
	public static void setMessage(String mess){
		message = mess;
	}


}
