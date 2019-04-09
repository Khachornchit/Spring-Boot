package pluto.solutions.services;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import pluto.solutions.entity.Customer;

@Service
public class CustomerService {

	List<Customer> customers = new LinkedList<Customer>(Arrays.asList(
			new Customer("Mary", "Smith"),
			new Customer("Patrica", "Johnson"), 
			new Customer("Linda", "Williams")));

	public List<Customer> get() {
		return customers;
	}

	public Customer get(int id) {
		return customers.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public Customer add(Customer customer) {
		customers.add(customer);
		return customer;
	}

	public Customer update(int id, Customer customer) {
		int index = customers.indexOf(customers.stream().filter(t -> t.getId() == id).findFirst().get());
		customers.set(index, customer);
		return customers.get(index);
	}

	public void delete(int id) {
		int index = customers.indexOf(customers.stream().filter(t -> t.getId() == id).findFirst().get());
		customers.remove(index);
	}
}
