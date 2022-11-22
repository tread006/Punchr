
public class Employee extends User {
	
	//String empID;
	
	public Employee( String email, String fname, String lname, String password) {
		super (email, fname, lname, password);
	}
	
	void printEmployeeDetails() {
	    System.out.println("Employee email   :  " + email);
	    System.out.println("Employee first name    :  " + fname);
	    System.out.println("Employee last name :  " + lname);
	}



}


