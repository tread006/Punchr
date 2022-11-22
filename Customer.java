import java.util.Date;
import java.util.ArrayList;
import java.text.*;

public class Customer extends User {
	
	private String punchID;	
	private int numberofpunches;
	private Date birthday;			//MMDDYYYY
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip5;
	private boolean optinEmail;		//agree or disagree (true or false)
	private ArrayList<Reward> rewards; //allows for resizing to more than 10 rewards later
	
	SimpleDateFormat formatDate = 
      new SimpleDateFormat ("dd/MM/yyyy");

	public Customer(String bday, String street1, String street2, String city, String state, String zip, boolean optin, String email, String fname, String lname, String password) {
		super (email, fname, lname, password);
		this.punchID = "test"; //need a method to create a unique ID for this user. Hash table in driver?
		this.numberofpunches = 0;
		//this.birthday = new Date(formatDate(bday)); //need a method to update the date from the user input

		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip5 = zip; //need to 0 fill and cut to 5 digits. zip is NOT an integer

		//welcome reward is the same code for everyone?
		ArrayList<Reward> rewards = new ArrayList<Reward>();
		rewards.add(new Reward("999999"));//first reward is welcome reward
		rewards.add(new Reward(0, "Birthday Reward"));//birthday reward
		//Need to add remaining rewards and descriptions
		//for loop is for testing only
		for (Reward i : rewards) {
		  System.out.println(i);}

	}
	
	
	void printCustomerDetails() {
	    System.out.println("Customer email:    " + email);
	    System.out.println("Customer first name:    " + fname);
	    System.out.println("Customer last name:    " + lname);	   
	    
		System.out.println("Customer ID:    " + punchID);
	    System.out.println("Number of punche(s):    " + numberofpunches);
	    System.out.println("Birth date:    " + birthday);
	    System.out.println("You agreed that PunchR can collect your data for improvement purposes:    " + optinEmail);

	}


}
