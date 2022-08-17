package omotenapp.com.cmd;

public class People { //Blue print
	
	private String name;
	private String email;
	public String endereco; // :-o
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", email=" + email + "]";
	}
	
	
	
}
