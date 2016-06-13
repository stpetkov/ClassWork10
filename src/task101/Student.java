package task101;

public class Student {
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", facNumber=" + facNumber + ", group="
				+ group + "]";
	}
	public Student(String firstName, String lastName, int facNumber, int group) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.facNumber = facNumber;
		this.group = group;
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
	public int getFacNumber() {
		return facNumber;
	}
	public void setFacNumber(int facNumber) {
		this.facNumber = facNumber;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	private String firstName;
	private String lastName;
	private int facNumber;
	private int group;
}
