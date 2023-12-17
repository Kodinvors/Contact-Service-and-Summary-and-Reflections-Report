package contact;

import java.util.ArrayList;

/*
 * Adds, removes, or updates contacts.
 */
public class ContactService {
	
	private ArrayList<Contact> contacts;
	
	// Creates the contacts array.
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// Checks if a given contact already exists, if not a new contact is created.
	public boolean addContact(Contact contact) {
		boolean contactAlready = false;
		
		for (Contact contactList:contacts) {
			
			if (contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		
		if (!contactAlready) {
			contacts.add(contact);
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
	// Checks if a given contact exists, if so the contact is deleted.
	public boolean deleteContact(String ContactID) {
		
		for (Contact contactList:contacts) {
			
			if (contactList.getContactID().equals(ContactID)) {
				
				contacts.remove(contactList);
				
				return true;
			}
		}	
		return false;
	}
	
	// Checks if a contact exists, if so the contact is updated.
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		for (Contact contactList:contacts) {
			if (contactList.getContactID().equals(contactID)) {
				
				// Checks that first name is not null and does not exceed a length of 10.
				if (!firstName.equals("") && !(firstName.length() > 10)) {
					contactList.setFirstName(firstName);
				}
				
				// Checks that last name is not null and does not exceed a length of 10.
				if (!lastName.equals("") && !(lastName.length() > 10)) {
					contactList.setLastName(lastName);
				}
				
				// Checks that phone number is not null and is 10 characters.
				if (!phoneNumber.equals("") && (phoneNumber.length() == 10)) {
					contactList.setPhoneNumber(phoneNumber);
				}
				
				// Checks that address is not null and does not exceed a length of 30.
				if (!address.equals("") && !(address.length() > 30)) {
					contactList.setAddress(address);
				}
				
				return true;
			}
		}
		return false;
	}
}
