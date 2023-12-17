package contact;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Tests the ContactService Class.
 */
public class ContactServiceTest {
	
	// Tests that contacts are properly added.
	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("465456", "Jean", "Gray", "5555555555", "X Mansion");
		Contact test2 = new Contact("75725", "Scott", "Summers", "6666666666", "Danger Room");
		Contact test3 = new Contact("8745675", "Ororo", "Munroe", "7777777777", "X Jet");
		
		assertEquals(true, cs.addContact(test1));
		assertEquals(true, cs.addContact(test2));
		assertEquals(true, cs.addContact(test3));
	}
	
	// Tests contacts are properly deleted.
	@Test
	public void testDelete() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("465456", "Jean", "Gray", "5555555555", "X Mansion");
		Contact test2 = new Contact("75725", "Scott", "Summers", "6666666666", "Danger Room");
		Contact test3 = new Contact("8745675", "Ororo", "Munroe", "7777777777", "X Jet");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.deleteContact("75725"));
		assertEquals(false, cs.deleteContact("75724"));
		assertEquals(false, cs.deleteContact("75725"));
	}
	
	// Tests that contacts are properly updated.
	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("465456", "Jean", "Gray", "5555555555", "X Mansion");
		Contact test2 = new Contact("75725", "Scott", "Summers", "6666666666", "Danger Room");
		Contact test3 = new Contact("8745675", "Ororo", "Munroe", "7777777777", "X Jet");	
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updateContact("465456", "Jean", "Gray", "5555555555", "X Mansion"));
		assertEquals(false, cs.updateContact("465457", "Jean", "Gray", "5555555555", "X Mansion"));
	}
}
