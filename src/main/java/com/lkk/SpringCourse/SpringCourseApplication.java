package com.lkk.SpringCourse;

import com.lkk.SpringCourse.DAOs.CustomerDAO;
import com.lkk.SpringCourse.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
		scanBasePackages = {"com.lkk.SpringCourse",
		"com.lkk.utilities"}
)
public class SpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCourseApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CustomerDAO customerDAO) {
		return hypotheticalArgs -> {
//			createCustomer(customerDAO);
			createMultipleCustomers(customerDAO);
		};
	}

	private void createCustomer(CustomerDAO customerDAO) {
		Customer newCustomer = new Customer("Kaan","Kosesoy","kaan@kosesoy.com");

		customerDAO.save(newCustomer);
		// Print the info on created/saved customer
		System.out.println("Customer last name: " + newCustomer.getLastName() + "\nGenerated id: " + newCustomer.getId());
	}

	private void createMultipleCustomers(CustomerDAO customerDAO) {
		Customer newCustomer1 = new Customer("Mert","Bakcaci","mert@bakcaci.com");
		Customer newCustomer2 = new Customer("Eren","Erdemir","eren@erdemir.com");
		Customer newCustomer3 = new Customer("Berk","Degerli","berk@degerli.com");

		customerDAO.save(newCustomer1);
		customerDAO.save(newCustomer2);
		customerDAO.save(newCustomer3);

		// Print the info on created/saved customers
		System.out.println("Customer last name: " + newCustomer1.getLastName() + "\nGenerated id: " + newCustomer1.getId());
		System.out.println("Customer last name: " + newCustomer2.getLastName() + "\nGenerated id: " + newCustomer2.getId());
		System.out.println("Customer last name: " + newCustomer3.getLastName() + "\nGenerated id: " + newCustomer3.getId());

	}



}
