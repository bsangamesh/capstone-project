package com.abctelecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abctelecom.entity.Feedback;
import com.abctelecom.entity.Ticket;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

	
	List<Feedback> findByTicket(Ticket ticket);
	
}
