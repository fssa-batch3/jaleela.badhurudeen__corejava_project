package MyProjectSpecsee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppointmentValidator {

	public static boolean validate(AppointmentBooking appointmentBooking) {
		PatientNameValidator(appointmentBooking.PatientName);
		AddressValidator(appointmentBooking.Address);
		startTimeValidator(appointmentBooking.startTime);
		endTimeValidator(appointmentBooking.endTime);

		return true;
	}

//name validate
	public static boolean PatientNameValidator(String PatientName) throws IllegalArgumentException {

		if (PatientName == null || "".equals(PatientName.trim())) {
			throw new IllegalArgumentException(" Patient Name cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z]{2,35}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(PatientName);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("The name should be  minimum 2 letters and maximum 35 letters");

		}

		return true;

	}

// address
	public static boolean AddressValidator(String Address) throws IllegalArgumentException {

		if (Address == null || "".equals(Address.trim())) {
			throw new IllegalArgumentException("address cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z0-9\\\\p{Punct}\\\\s]{10,150}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(Address);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("The address should be  minimum 10 letters and maximum 150 letters");

		}

		return true;

	}

	// start time validate
	public static boolean startTimeValidator(String startTime) throws IllegalArgumentException {

		if (startTime == null) {
			throw new IllegalArgumentException("time cannot be empty or null");
		}

		return true;

	}

	// end Time validate
	public static boolean endTimeValidator(String endTime) throws IllegalArgumentException {

		if (endTime == null) {
			throw new IllegalArgumentException("time cannot be empty or null");
		}

		return true;

	}

}