package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * Tests the Contact Class.
 */
public class ContactTest {
	
	// Tests that the inputs for the Contact class are correctly assigned in the constructor.
	@Test
	public void testContactConstructor() {
		Contact contact = new Contact("465456", "Jean", "Gray", "5555555555", "X Mansion");
		
		assertEquals("465456", contact.getContactID());
		assertEquals("Jean", contact.getFirstName());
		assertEquals("Gray", contact.getLastName());
		assertEquals("5555555555", contact.getPhoneNumber());
		assertEquals("X Mansion", contact.getAddress());
	}
	
	// Tests that each getter returns the proper setter.
	@Test
	public void testContactSetters() {
		Contact contact = new Contact("75725", "Scott", "Summers", "6666666666", "Danger Room");
		
		contact.setFirstName("Scott");
		contact.setLastName("Summers");
		contact.setPhoneNumber("6666666666");
		contact.setAddress("Danger Room");
		
		assertEquals("Scott", contact.getFirstName());
		assertEquals("Summers", contact.getLastName());
		assertEquals("6666666666", contact.getPhoneNumber());
		assertEquals("Danger Room", contact.getAddress());
	}
}
