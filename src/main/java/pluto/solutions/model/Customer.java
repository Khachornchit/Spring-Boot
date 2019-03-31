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

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String description) {
		this.lastName = description;
	}

	public Customer(String id, String name, String description) {
		super();
		this.id = id;
		this.firstName = name;
		this.lastName = description;
	}

	public Customer() {
		
	}

}
