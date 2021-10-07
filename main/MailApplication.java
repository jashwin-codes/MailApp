package main;

import java.util.Scanner;

public class MailApplication {
private static Scanner sc;
private static MailRepository dataBase;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		dataBase = new MailRepository();
		
		while(true) {
			System.out.println("1.Create account 2.Login");
			int choice=Integer.parseInt(sc.nextLine());
			if(choice==1)
				createAccount();
			else
				login();
		}

	}

	private static void login() {
		Account acc;
		System.out.println("Enter your id");
		String id = sc.nextLine();
		if((acc=dataBase.getAccount(id))!=null) {
			System.out.println("Enter your password");
			String pass = sc.nextLine();
			if(acc.getPassword().equals(pass))
				System.out.println("Account found \n"+acc);
			else
				System.out.println("Wrong Password");
		}
		else
			System.out.println("Account not found");
	}

	private static void createAccount() {
		String id,password;
		System.out.println("Enter the Id ");
		id = sc.nextLine();
		System.out.println("Enter the Password");
		password = sc.nextLine();
		Account acc = new Account(id, password);
		dataBase.addAcccount(acc);
	}

}
