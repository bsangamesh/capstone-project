package com.abctelecom.service;

import java.util.List;

import com.abctelecom.entity.Feedback;
import com.abctelecom.entity.Notes;
import com.abctelecom.entity.Ticket;



public interface TicketService {

	String save(Ticket ticket);

	List<Ticket> getAllTickets();

	List<Ticket> getTicketsByCustomerId(Long id);

	Ticket getTicketById(Long id);

	List<Notes> getNotesByTicketId(Long id);

	String saveNotes(Notes notes);
	
	String saveFeedback(Feedback feedback);
	
	Feedback findFeedbackByTicket(Long id);
	
} 