package com.springboot.trng.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.trng.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{
	
	//public List getAllUsers();
	
	//public User getDBUser(int userId);
	
	//public User createDBUser(User user);
	
	//public User updateDBUser(int userId, User user);
	
	//public void deleteDBUser(int userId);
	
	// List<User> firstName(String firstName);  This will work fine 
	
	// List<User> readByFirstName(String firstName);  This will work fine
	
	List<User> findByFirstName(String firstName);
	
	List<User> test(String firstName);
	
	List<User> findByFirstNameAndLastName(String firstName, String lastName);
	
	//List<User> nativeLastName(String lastName);
	
	

}
