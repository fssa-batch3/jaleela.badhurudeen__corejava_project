package MyProjectSpecsee;

import org.junit.Assert;
import org.junit.Test;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
public class TestBookingAppointment {







//  for valid ground  name
	@Test

	public void testValidPatientName() {
		Assert.assertTrue(AppointmentValidator.PatientNameValidator("Priya"));
	}

//  for invalid ground name
	@Test
	public void testInvalidPatientName() {

		try {
			AppointmentValidator.PatientNameValidator(null);
			Assert.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assert.assertEquals("Name cannot be empty or null", ex.getMessage());
		}

		try {
			AppointmentValidator.PatientNameValidator("a");
			Assert.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assert.assertEquals("The name should be  minimum 2 letters and maximum 35 letters", ex.getMessage());
		}

	}



//  for valid groundaddress
	@Test

	public void testValidaddress() {
		Assert.assertTrue(AppointmentValidator.AddressValidator("Hellohellook"));
	}

//  for invalid groundaddress
	@Test
	public void testInvalidaddress() {

		try {
			AppointmentValidator.AddressValidator(null);
			Assert.fail("Validateaddress failed");
		} catch (IllegalArgumentException ex) {
			Assert.assertEquals("address cannot be empty or null", ex.getMessage());
		}
		

		try {
			AppointmentValidator.AddressValidator("a");
			Assert.fail("Validateaddress failed");
		} catch (IllegalArgumentException ex) {
			Assert.assertEquals("The address should be  minimum 10 letters and maximum 150 letters",
					ex.getMessage());
		}

	}


//  for valid startTime
	@Test

	public void testValidstarttime() {
		Assert.assertTrue(AppointmentValidator.startTimeValidator("12:00"));
	}

//  for invalid startTime
	@Test
	public void testInvalidstarttime() {
		try {
			AppointmentValidator.startTimeValidator(null);
			Assert.fail("Validatetime failed");
		} catch (IllegalArgumentException ex) {
			Assert.assertEquals("time cannot be empty or null", ex.getMessage());
		}

	}
       
//  for valid endTime
	@Test

	public void testValidendtime() {
		Assert.assertTrue(AppointmentValidator.endTimeValidator("12:00"));
	}

//  for invalid endTime
	@Test
	public void testInvalidendtime() {
		try {
			AppointmentValidator.endTimeValidator(null);
			Assert.fail("Validatetime failed");
		} catch (IllegalArgumentException ex) {
			Assert.assertEquals("time cannot be empty or null", ex.getMessage());
		}

	}

}