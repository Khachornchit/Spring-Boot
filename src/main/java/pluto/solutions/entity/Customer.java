package pluto.solutions.entity;

public class Customer {

	private int id;
	
	private String firstName;
	
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public Customer(int id, String firstname, String lastname) {
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}

	public Customer() {
		
	}

}
