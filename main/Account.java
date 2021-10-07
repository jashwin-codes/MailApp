package main;

public class Account {
	private String id,password;

	public Account(String id,String password) {
		this.id=id;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Id : "+id+" Password : "+ password;
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
