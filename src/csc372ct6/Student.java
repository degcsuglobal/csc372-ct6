package csc372ct6;


// Represents a student with a roll number, name, and address that we can compare in the other class.
public class Student {
	private int rollno;
	private String name;
	private String address;


	public Student(String name, String address, int rollno) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public int getRollNumber() {
		return rollno;
	}

	public void setRollNumber(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
