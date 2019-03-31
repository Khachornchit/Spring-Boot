package pluto.solutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pluto.solutions.model.Customer;
import pluto.solutions.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public List<Customer> get() {
		return customerService.get();
	}

	@RequestMapping("/customers/{id}")
	public Customer get(@PathVariable String id) {
		return customerService.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public Customer add(@RequestBody Customer customer) {
		return customerService.add(customer);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
	public Customer update(@RequestBody Customer customer, @PathVariable String id) {
		return customerService.update(id, customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}")
	public void delete(@PathVariable String id) {
		customerService.delete(id);
	}
}
