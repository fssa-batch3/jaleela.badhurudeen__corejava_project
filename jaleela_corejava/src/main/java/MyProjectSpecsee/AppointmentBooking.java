package MyProjectSpecsee;

public class AppointmentBooking {



	String PatientName;
	String Address;
	String startTime;
	String endTime;
	
	
	
	public String getGroundName() {
		return PatientName;
	}
	public void setPatientName(String PatientName) {
		this.PatientName = PatientName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
		
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	

	
}