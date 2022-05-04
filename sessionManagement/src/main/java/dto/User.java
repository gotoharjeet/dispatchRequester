package dto;

public class User {

	private String fname;
	private String lname;
	private int age;
	private String email;
	private String address;
	private String city;
	private String state;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String toString()
	{
		return "FirstName : "+fname+
				"LastName : "+lname+
				"Age :"+age+
				"Email :"+email+
				"Address : "+address+
				"City :"+city+
				"State :"+state;
	}
}
