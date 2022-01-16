package com.abctelecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abctelecom.entity.Engineer;
import com.abctelecom.entity.User;



public interface EngineerRepository extends JpaRepository<Engineer, Long>{

	List<Engineer> findByUser(User user);
	List<Engineer> findByZipcode(String zipcode);
}