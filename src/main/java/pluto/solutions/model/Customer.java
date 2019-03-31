package pluto.solutions.model;

public class Customer {
	private String id;
	private String firstName;
	private String lastName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Customer(String id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}

	public Customer() {
		
	}

}
