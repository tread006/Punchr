import java.time.LocalDate; // import the LocalDate class


public class Main {
  public static void main(String[] args) {
    
    LocalDate myObj = LocalDate.now().plusDays(60); // Create a date object
    System.out.println(myObj); // Display the current date
    
    Customer a = new Customer("12/25/1993", "street1","street2", "city", "state", "zip5", true, "karen01@csusm.edu", "Karen", "Stevenson", "password");
		a.printCustomerDetails();
		
		Employee b = new Employee("gaye002@csusm.edu", "lucie", "gaye", "12345");
		b.printEmployeeDetails();
  }
}
