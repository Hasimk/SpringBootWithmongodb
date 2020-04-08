package com.pack.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.pack.document.Customer;
import com.pack.repository.CustomerRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired

	ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {

		CustomerRepository custRepo = (CustomerRepository) ctx.getBean("customerRepository");

		
		/*
		 * Customer customer = new Customer();
		 * 
		 * customer.setId(1011); customer.setCustomerName("Java");
		 * customer.setCity("MUMBAi");
		 * 
		 * custRepo.save(customer);
		 */
		 
				
		  Optional <Customer> opt= custRepo.findById(1011);
		  Customer customer =opt.get(); 
		  System.out.println(customer.getCustomerName());
		 
		
		

	}

}
