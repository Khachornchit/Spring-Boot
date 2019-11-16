package net.putfirstthingsfirst.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.putfirstthingsfirst.model.Customer;

@Service
public class CustomerService {

	List<Customer> customers = new LinkedList<Customer>(Arrays.asList(
			new Customer(1, "Jack", "Davis"),
			new Customer(2, "Oliver", "Miller"), 
			new Customer(3, "Samuel", "Brown")));

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
