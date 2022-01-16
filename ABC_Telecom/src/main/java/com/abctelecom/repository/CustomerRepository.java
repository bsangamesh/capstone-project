package com.abctelecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abctelecom.entity.Customer;
import com.abctelecom.entity.User;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByUser(User user);

}
