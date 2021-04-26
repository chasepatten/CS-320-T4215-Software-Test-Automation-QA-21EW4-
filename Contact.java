import java.util.*;
import ContactService;

public class Contact {

	private final byte MAX_CONTACT_ID_LENGTH = 10; // Max length of contact id name set as a constant
	private final byte MAX_FIRST_NAME_LENGTH = 10; // Max length of first name set as a constant
	private final byte MAX_LAST_NAME_LENGTH = 10; // Max length of last name set as a constant
	private final int MIN_PHONE_NUM_LENGTH = 10; // Minimum length of phone number name set as a constant
	private final byte MAX_ADDRESS_LENGTH = 30;  // Max length of address set as a constant
	private String contactID; // uninitialized contact ID field for the contact object
	private String firstName;  // uninitialized first name variable for the first name field for the contact object
	private String lastName; // uninitialized last name variable for the last name field for the contact object
	private String phoneNumber; // uninitialized phone number variable for the phone number field for the contact object 
	private String address; // uninitialized address variable for the address field for the contact object
	
	
	Contact() {
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	
	/* I made only one object taking in all of the required fields as in the instructions it stated that
	all of these fields were required to be input. So, I did not see a reason to overload the Contact
	object for singular inputs and using my initialInput to cover the rest. */
	Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	// Get functions
	 protected final String getContactId() { // Gets contactID
		 return contactID; 
	 }

	  protected final String getFirstName() { // Gets firstName
		 return firstName; 
	 }

	  protected final String getLastName() { // Gets lastName
		  return lastName; 
	  }

	  protected final String getPhoneNumber() { // gets phoneNumber
		  return phoneNumber; 
	  }

	  protected final String getAddress() { // Gets address
		  return address; 
	  }

	  // Function used to update firstName
	  protected void updateFirstName(String firstName) { // takes firstName in as a parameter
	    if (firstName == null) { // IF condition to determine if input is null
	      throw new IllegalArgumentException("First name must have a valid input"); // if it is it triggers exception
	    } else if (firstName.length() > MAX_FIRST_NAME_LENGTH) { // Determines that the name does not meet max length allowed
	      throw new IllegalArgumentException("First name cannot be longer than 10 characters"); // if it does it triggers exception
	    } else {
	      this.firstName = firstName; // IF it passes the checks then it is assigned the new update
	    }
	  }

	  // Function used to update lastName
	  protected void updateLastName(String lastName) { // takes firstName in as a parameter
	    if (lastName == null) {// IF condition to determine if input is null
	      throw new IllegalArgumentException("Last name must have valid input"); // if it is it triggers exception
	    } else if (lastName.length() > MAX_LAST_NAME_LENGTH) { // Determines that the name does not meet max length allowed
	      throw new IllegalArgumentException("Last name cannot be longer than 10 characters"); // if it does it triggers exception
	    } else {
	      this.lastName = lastName;  // IF it passes the checks then it is assigned the new update
	    }
	  }

	  protected void updatePhoneNumber(String phoneNumber) {
	    String allowed_digits = "[0-9]+"; // Sets what the phone number digits can be
	    if (phoneNumber == null) { // IF the phoneNumber is equal to null
	      throw new IllegalArgumentException("Phone number must have valid input"); // then exception is thrown
	    } else if (phoneNumber.length() != MIN_PHONE_NUM_LENGTH) { // if phoneNumber does not meet minimum length
	      throw new IllegalArgumentException(
	          "Phone number length must be at least 10 digits."); // exception is thrown
	    } else if (!phoneNumber.matches(allowed_digits)) { // if phoneNumber has digits in it it does not allow according to allowed_digits variable
	      throw new IllegalArgumentException(
	          "Phone number must consist only of numbers");
	    } else {
	      this.phoneNumber = phoneNumber; // if it passes then phoneNumber is updated
	    }
	  }

	  protected void updateAddress(String address) {
	    if (address == null) { // checks to see if address is equal to null
	      throw new IllegalArgumentException("Address cannot be empty"); // if it is then the exception is thrown
	    } else if (address.length() > MAX_ADDRESS_LENGTH) { // if address is bigger then ten characters
	      throw new IllegalArgumentException("Address cannot be longer than 10 characters."); // then the exception is thrown
	    } else {
	      this.address = address; // if it passes the checks then it updates address
	    }
	  }

	  protected void updateContactId(String contactID) {
	    if (contactID == null) { // checks to see if the contactID is null
	      throw new IllegalArgumentException("Contact ID cannot be empty"); // if it is then the exception si thrown
	    } else if (contactID.length() > MAX_CONTACT_ID_LENGTH) {  // checks to see if the length is within constraints
	      throw new IllegalArgumentException("Contact ID cannot be longer than 10 characters"); // if it is then exception is thrown
	    } else {
	      this.contactID = contactID;  // if it passes checks then it updates contactID
	    }
	  }	
}