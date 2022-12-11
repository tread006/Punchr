

public abstract class User { //User class
	
	 protected String email;
	 protected String password;
	 protected String fname;
	 protected String lname;
	 
	
	
	 User(String email, String fname, String lname, String password) {
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
	}


	


	/*
	public User(String email, String fname, String lname, String password) {
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}*/	

}
