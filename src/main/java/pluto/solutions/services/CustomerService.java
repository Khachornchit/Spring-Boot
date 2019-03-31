package pluto.solutions.services;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import pluto.solutions.model.Customer;

@Service
public class CustomerService {

	List<Customer> customers = new LinkedList<Customer>(Arrays.asList(
			new Customer("1", "firstname 1", "lastname 1"),
			new Customer("2", "firstname 2", "lastname 2"), 
			new Customer("3", "firstname 3", "lastname 3")));

	public List<Customer> get() {
		return customers;
	}

	public Customer get(String id) {
		return customers.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public Customer add(Customer topic) {
		customers.add(topic);
		return topic;
	}

	public Customer update(String id, Customer topic) {
		int index = customers.indexOf(customers.stream().filter(t -> t.getId().equals(id)).findFirst().get());
		customers.set(index, topic);
		return customers.get(index);
	}

	public void delete(String id) {
		int index = customers.indexOf(customers.stream().filter(t -> t.getId().equals(id)).findFirst().get());
		customers.remove(index);
	}
}
