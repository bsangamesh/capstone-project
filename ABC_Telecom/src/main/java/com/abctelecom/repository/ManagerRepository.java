package com.abctelecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abctelecom.entity.Manager;
import com.abctelecom.entity.User;


public interface ManagerRepository extends JpaRepository<Manager, Long>{

	List<Manager> findByUser(User user);
}
