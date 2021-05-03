package randomGameBackendSimulation;

import java.sql.Date;

public class User {
	private String TcNo;
	private String firstName;
	private String lastName;
	private Date birthDate;
	
	public User(String tcNo, String firstName, String lastName) {
		
		
		this.TcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public String getTcNo() {
		return TcNo;
	}

	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
