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
	
	public void markRewardRedeemed(String rewardName, String rewardCode){
		for (Reward i : rewards) {
			if (i.getDescription() == rewardName)
				;
				}
    }

	public void markRewardExpired(String rewardName){
		for (Reward i : rewards) {
			if (i.getDescription() == rewardName)
				;
				}
    }

	public void markRewardUsed(String rewardName){
		for (Reward i : rewards) {
			if (i.getDescription() == rewardName)
				;
				}
    }

	public void markRewardAvailable(String rewardName){
		for (Reward i : rewards) {
			if (i.getDescription() == rewardName)
				;
				}
    }

	public String getPunchID() {
		return punchID;
	}


	public void setPunchID(String punchID) {
		this.punchID = punchID;
	}


	public int getNumberofpunches() {
		return numberofpunches;
	}


	public void setNumberofpunches(int numberofpunches) {
		this.numberofpunches = numberofpunches;
	}

	public void addOnePunch() {
		this.numberofpunches = numberofpunches + 1;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getStreet1() {
		return street1;
	}


	public void setStreet1(String street1) {
		this.street1 = street1;
	}


	public String getStreet2() {
		return street2;
	}


	public void setStreet2(String street2) {
		this.street2 = street2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip5() {
		return zip5;
	}


	public void setZip5(String zip5) {
		this.zip5 = zip5;
	}


	public boolean isOptinEmail() {
		return optinEmail;
	}


	public void setOptinEmail(boolean optinEmail) {
		this.optinEmail = optinEmail;
	}


	public ArrayList<Reward> getRewards() {
		return rewards;
	}


	public void setRewards(ArrayList<Reward> rewards) {
		this.rewards = rewards;
	}


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
