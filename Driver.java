import java.util.Hashtable;

public class Driver 
{
    //The Driver houses the functionality of the program

    //variables
    database Customers;
    database Employees;
    database Rewards;
    Hashtable punchCodes;
    Hashtable rewardCodes;

    //creates unique alphanumeric codes and stores in corresp. hashtable
    CodeGenerator generator; 
    


    //Constructor
    public Driver()
    {
        //Connects to databases?
    }

    //Methods of Driver

    /* displayLoginPage() method: Used by both Employee and Customers
     * Preconditions: User must request webpage on a device with working internet
     * Conditions: a device with working internet
     * PostConditions: Connection to databases?
     */
    public void displayLoginPage() {
        //connect to HTML/CSS for page?
    }

        /* displayCreateAcctPage() method: Used by both Employee and Customers
     * Preconditions: User must request click Create Account button from login page
     * Conditions: n/a
     * PostConditions: Create Account Page is displayed 
     */
    public void displayCreateAcctPage() {
        //connect to HTML/CSS for page?
    }

    /* login method: Used by both Employee and Customers
     * Preconditions: Login screen is displayed
     * Conditions: Valid credentials are input on login screen
     * Postconditions: For Customers, main landing page is displayed
     *                      displayMainPage() is called
     *                 For Employees, input code page is displayed 
     *                      displayInputScreen() is called*/  
    public void login(String inputEmail, String inputPassword) {
        if (Employees contains inputEmail)
            if (inputEmail and inputPassword match exactly)
                displayInputScreen();
            else //email is confirmed to be in there already-- something must be wrong with password
                print to login screen "invalid password";

        if (Customers contains inputEmail)
            if (inputEmail and inputPassword match exactly)
                displayMainPage();
            else //email is confirmed to be in there already-- something must be wrong with password
                print to login screen "invalid password";
        else //email is not listed in either database
            print to login screen "invalid email address";

        

    }

    /* logout method: Used by both Employee and Customers
     * Preconditions: User must be logged in
     * Conditions: User clicks log out button, and answers YES to Are you sure?
     * Postconditions: login page is displayed*/  
    public void logout() {
        //How is this accomplished? When a person logs in, is there a boolean that's marked true?
        //bool loggedIn = true and then it's marked false when you click the log out button...
        //and then when you try to display the rewards page/punchcode, the bool will reroute you to log in?
        //returns to login page
    }

    /* createAcct() method: Used by both Employee and Customers
     * Preconditions: Create Acct screen is displayed
     *  Conditions: Valid new email/password are input - required fields are filled in.
     *              unique, correct user input, all required fields filled in, 
     *              if checked box for staff user, must include correct staff code
     * Postconditions: If accepted, new user account is added to appropriate db,
     *                  for Customer accts, codeGenerator is called to store punch code
     *                  login screen is displayed for first login  displayLoginPage() method called  */
    public void createAcct() {
        /* (before DB cnctn) 
         * check password 8 long and chars w/ num
         * check fName lName not blank
         * can leave DOB blank
         * can leave address and phone blank
         * is Staff checkbox checked? if no, connect to Customer DB
         * if yes, is the staff code correct? 
         *          if yes, connect to Staff DB addUser(Employees)
         *          if no, throw error message - do no allow account creation
         * connectDB() ?
         * check if email already exists in corresponding DB
         * addUser(Customers) (also initializes rewards in rewards DB tied to customer DB by punchCode)
         * if addUser() = true -- displayLoginPage() else email is not unique, display error message*/
    }

    /* addUser() method: Used by both Employee and Customers
     * Preconditions: User hit submit on CreateAccount page; password and required fields are filled
     * Conditions: Throws an error message if email address is already in db and returns false
     * Postconditions: If accepted, new user account is added to appropriate db,
     *                  for Customer accts, codeGenerator is called to create/store punch code 
     *                  and rewards are initialized in Rewards db
     *                  returns true to createAcct()  */

     public boolean addUser(Database db) {

     }


    //Customers only methods
    /* displayMainPage() method: Used by Customers ONLY
     * Preconditions: Customer must have a valid account and be logged in
     * Conditions: Automatically called by login() for Customer accounts
     * PostConditions: None
     */
    public void displayMainPage() {
        //Main page consists of a punch count in large font and three main buttons along bottom of screen
        //Three main buttons: Rewards, PunchCode, Log Out
    }

    /* displayPunchCode() method: Used by Customers ONLY
     * Preconditions: Customer must have a valid account and be logged in.
     *                  Customer pressed PunchCode button on main page
     * Conditions: Customer clicks Punch Code button on UI- Punch code is displayed
     * PostConditions: Employee must use logPunch() method in order for punch to be logged
     */
    public void displayPunchCode() {
        //
    }

     /* displayRewards() method: Used by Customers ONLY
     * Preconditions: Customer must have a valid account and be logged in
     * Conditions: Customer clicks Rewards button on UI- Rewards are displayed
     *              Rewards which are available will show a REDEEM button
     *              Rewards which are expired will show as grayed out
     * PostConditions: Customer must use requestRewards() method 
     *                  in order for reward code to be displayed
     */
    public void displayRewards() {
        //Calls updateRewards(customer or punchCode) method each time the displayRewards button is pushed?
        //A frame exists for all (10) possible rewards.
        //Unavailable rewards will show description AND a countdown to how many more punches are required
        //Available rewards will show Redeem buttons 
        //Redeemed rewards will show redemption code and expiration date (if applicable)
        //Expired rewards will remain in the frame, but the redemption code will be replaced with "EXPIRED"
        //Used rewards will remain in the frame, but the redemption code will be replaced with "USED on {date}"

    }

    /* updateRewards(punchCode) method: Used by Customers ONLY
     * Preconditions: Customer clicked on the display Rewards button; 
     *                  Requires a punchCode parameter to access the Rewards db
     * Conditions: Customer clicks Rewards button on UI- Rewards are updated
     *              Rewards which are available will show a REDEEM button
     *              Rewards which are expired will show as grayed out
     *              Rewards which are already used will show as grayed out
     * PostConditions: displayRewards finishes running
     * 
    */
    public void updateRewards(String punchCode)  {
        //Uses punchCode to connect to the (10) corresp rewards in the Rewards db
        //punchCode is also used to connect to the corresp Customer acct in Customers db
        int currentPunches = numberofpunches from Customer matching punchCode;
        for (rewards from Rewards matching punchCode)
            if (currentPunches == punchesRequired && redeemed == false && description != "Birthday Reward")
                makeRewardRedeemable(reward name); //marks bools, creates button in UI
            else if ((todays date to MMDD matches customer bday to MMDD) && redeemed == false)
                markRewardRedeemable(Birthday Reward); //marks bools, creates button in UI
            else if ((todays date to MMDD >= expiration date) && used == false && rewardCode != NULL)
                markRewardExpired(reward name); //set rewardCode to NULL, update bools, update UI
            else if (used==true && rewardCode != NULL)
                markRewardUsed(reward name); //set rewardCode to NULL, update bools, update UI

    }

    /* redeemReward() method: Used by Customers ONLY
     * Preconditions: Customer must have a valid acct, be logged in, 
     *                  and have a reward available to redeem.
     *              Customer must be on rewards screen.
     * Conditions: Customer clicks on REDEEM button for corresp reward. Calls Code Generator
     *              Passes PunchCode and reward description to function
     * Postconditions: A unique code is now displayed on rewards screen near corresp
     *                  reward. An expiration date (if applicable) is also displayed 
     *                  Employee must use logReward() method in order for reward to
     *                  be applied.
     */
    public void redeemReward(String punchCode, String rewardName) {
        //update bools and expiration date (if applicable)
        //call codeGenerator to create and add code to hashtable and rewards db
        //update UI to show code and expiration date - How do we do this in real time??
    }

    //Employees only methods
    /* displayInputScreen() method: Used by Employees ONLY
     * Preconditions: Employee must have a valid account and be logged in
     * Conditions: Automatically called after login()
     * Postconditions: Employees can now input Punches and/or rewards
    */
    public void displayInputScreen() {
        //
    }

    /* inputPunch() method: Used by Employees ONLY
     * Preconditions: Employee must have a valid account and be logged in
     * Conditions: Employee types code into text box on input screen; Enter/Submit button
     * Postconditions: Message is displayed stating 
     *                  1. whether code was accepted
     *                  2. if accepted, whether an action is required by employee
     *                  3. if not accepted, what was wrong with code (invalid/expired/etc.)
    */
    public void inputCode() {
        //
    }


}
