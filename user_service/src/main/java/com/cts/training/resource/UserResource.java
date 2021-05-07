package com.cts.training.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.bean.User;
import com.cts.training.repository.UserRespository;

@RestController
@RequestMapping("/api")
public class UserResource {
	
	@Autowired
	private UserRespository userRepository;
	//http://localhost:8082/api/users
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping("/users/address/{address}")
	public ResponseEntity<Optional<User>> getUserByAddress(@PathVariable String address) {
		Optional<User> user=userRepository.findByAddress(address);
		return new ResponseEntity<>(user, HttpStatus.FOUND);
	}

	@GetMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
	 @PostMapping
	    public User createUser(@RequestBody User user) {
	       User savedUser = userRepository.save(user);
	       return  savedUser;
	   }
}
