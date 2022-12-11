
public class Employee extends User {
	
	private string empID
	private string email;
	private string fname;
	private string lname;
	private password;

	// Getter
	public String getID() {
		return empID;
	}
	
	// Setter
	public void setID(String newID) {
		this.empID = newID;
	}

	// Getter
  	public String getFname() {
    	return fname;
  	}

  	// Setter
  	public void setFname(String newFName) {
   		this.fname = newFName;
  	}

	// Getter
	public String getLname() {
    	return lname;
  	}

  	// Setter
  	public void setLname(String newLName) {
   		this.lname = newLName;
  	}

	// Getter
	public String getPassword() {
    	return password;
  	}

  	// Setter
  	public void setPassword(String newPassword) {
   		this.password = newPassword;
  	}

	// Getter
	public String getEmail() {
    	return email;
  	}

  	// Setter
  	public void setEmail(String newEmail) {
   		this.email = newEmail;
  	}





	public Employee( String email, String fname, String lname, String password) {
		super (email, fname, lname, password);
	}
	
	void printEmployeeDetails() {
	    System.out.println("Employee email   :  " + email);
	    System.out.println("Employee first name    :  " + fname);
	    System.out.println("Employee last name :  " + lname);
	}
}


