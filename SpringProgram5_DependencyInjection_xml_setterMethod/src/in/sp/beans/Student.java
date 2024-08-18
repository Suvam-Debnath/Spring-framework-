package in.sp.beans;

public class Student {
	private int rollno;
	private String name;
	private Address address;
	
	
	public void setRollno(int rollno) {
		System.out.println("setter method rollno");
		this.rollno = rollno;
	}
	public void setName(String name) {
		System.out.println("setter method name");
		this.name = name;
	}
	public void setAddress(Address address) {
		System.out.println("setter method address");
		this.address = address;
	}
	public void display() {
		System.out.println("Roll : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}
