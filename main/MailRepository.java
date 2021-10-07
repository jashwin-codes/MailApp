package main;

import java.util.ArrayList;
import java.util.List;

public class MailRepository {
	private List<Account> accounts = new ArrayList<Account>();

	public void addAcccount(Account acc) {
		System.out.println("Account ("+acc+") added in db");
		accounts.add(acc);
	}

	public Account getAccount(String id) {
		for(var acc : accounts)
		{
			if(acc.getId().equals(id))
				return acc;
		}
		return null;
	}
}
