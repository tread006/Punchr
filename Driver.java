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
        //
    }

    /* login method: Used by both Employee and Customers
     * Preconditions: Login screen is displayed
     * Conditions: Valid credentials are input on login screen
     * Postconditions: For Customers, main landing page is displayed
     *                      displayMainPage() is called
     *                 For Employees, input code page is displayed 
     *                      displayInputScreen() is called*/  
    public void login() {
        //
    }

    /* logout method: Used by both Employee and Customers
     * Preconditions: User must be logged in
     * Conditions: User clicks log out button, and answers YES to Are you sure?
     * Postconditions: login page is displayed*/  
    public void logout() {
        //
    }

    /* createAcct() method: Used by both Employee and Customers
     * Preconditions: Create Acct screen is displayed
     *  Conditions: Valid new email/password are input - required fields are filled in.
     * Postconditions: If accepted, new user account is added to appropriate db,
     * login screen is displayed for first login    */
    public void createAcct() {
        //
    }

    //Customers only methods
    /* displayMainPage() method: Used by Customers ONLY
     * Preconditions: Customer must have a valid account and be logged in
     * Conditions: Automatically called by login() for Customer accounts
     * PostConditions: None
     */
    public void displayMainPage() {
        //
    }

    /* displayPunchCode() method: Used by Customers ONLY
     * Preconditions: Customer must have a valid account and be logged in
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
        //
    }

    /* requestReward() method: Used by Customers ONLY
     * Preconditions: Customer must have a valid acct, be logged in, 
     *                  and have a reward available to redeem.
     *              Customer must be on rewards screen.
     * Conditions: Customer clicks on REDEEM button for corresp reward.
     * Postconditions: A unique code is now displayed on rewards screen near corresp
     *                  reward. An expiration date (if applicable) is also displayed 
     *                  Employee must use logReward() method in order for reward to
     *                  be applied.
     */
    public void requestReward() {
        //
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
