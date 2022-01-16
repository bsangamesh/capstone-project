package com.abctelecom.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.abctelecom.dto.CustomerDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table

public class Customer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private User user;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "customer_service",joinColumns = @JoinColumn(name="customer_id"))
//	@Enumerated(EnumType.STRING)
	private Set<String> serviceType;
	
	
//	@OneToMany(mappedBy = "customer")
//	private Set<Ticket> tickets;
	
	@Column
	private String address;
	
	@Column
	private String zipcode;
	
	
	
	public Customer(CustomerDto customerDto) {
		
		this.user = customerDto.getUser();
		this.serviceType = customerDto.getServiceType();
		this.address = customerDto.getAddress();
		this.zipcode = customerDto.getZipcode();
	}



}
