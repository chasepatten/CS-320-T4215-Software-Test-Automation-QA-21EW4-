import java.util.ArrayList;  // Used to import the utilities for arrays
import java.util.List;  // Used to import the utilities for List's
import java.util.UUID;  // Used to help with generating a unique ID for each contact

public class ContactService {

  private String uniqueId; // This si the variable used to hold the unique ID
  private List<Contact> contactList = new ArrayList<>(); // This creates the list that the contact will be held in

  {
    uniqueId = UUID.randomUUID().toString().substring( // This helps to generate a random ID and then convert it to a string with a max length of ten
        0, Math.min(toString().length(), 10));
  }

  public void newContact(String firstname, String lastname, String phonenumber, // This creates the COntact object with all of the required fields
                         String address) {
    Contact contact =
        new Contact(newUniqueId(), firstname, lastname, phonenumber, address);
    contactList.add(contact); // uses the add function to add the contact to the list
  }

  //Used to delete contacts 
  public void deleteContact(String id) throws Exception { 
    contactList.remove(searchForContact(id));
  }

  // Used to update first name
  public void updateFirstName(String id, String firstName) throws Exception {
    searchForContact(id).updateFirstName(firstName);
  }

  // Used to update last name
  public void updateLastName(String id, String lastName) throws Exception {
    searchForContact(id).updateLastName(lastName);
  }

  // Used to update phone number
  public void updatePhoneNumber(String id, String phoneNumber)
      throws Exception {
    searchForContact(id).updatePhoneNumber(phoneNumber);
  }

  // Used to update address
  public void updateAddress(String id, String address) throws Exception {
    searchForContact(id).updateAddress(address);
  }

  protected List<Contact> getContactList() { // Function used to get the Contact list
	  return contactList; 
	  }

  // Function used to create new unique id
  private String newUniqueId() {
    return uniqueId = UUID.randomUUID().toString().substring(
               0, Math.min(toString().length(), 10));
  }

  // Function used to search for a contact
  private Contact contactSearch(String id) throws Exception {
    int index = 0;
    while (index < contactList.size()) {
      if (id.equals(contactList.get(index).getContactId())) {
        return contactList.get(index);
      }
      index++;
    }
    throw new Exception("This contact does not exist");
  }
}