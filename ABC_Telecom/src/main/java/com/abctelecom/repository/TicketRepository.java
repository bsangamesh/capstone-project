package com.abctelecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abctelecom.entity.Customer;
import com.abctelecom.entity.Engineer;
import com.abctelecom.entity.Ticket;



@CrossOrigin
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	

	List<Ticket> findByCustomer(Customer customer);
	List<Ticket> findByZipcode(String zipcode);
	List<Ticket> findByEngineer(Engineer engineer);
}
