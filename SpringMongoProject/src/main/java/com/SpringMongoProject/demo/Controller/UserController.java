package com.SpringMongoProject.demo.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringMongoProject.demo.Model.User;
import com.SpringMongoProject.demo.Repository.UserRepository;



@RestController  
@RequestMapping("/api")  
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
@Autowired
UserRepository userRepository;

@GetMapping("/users")
public List<User> getUsers(){
	List<User> userl = new ArrayList<>();
	userRepository.findAll().forEach(userl::add);
	return userl;
}
/*
@GetMapping("/users/{id}")
public Optional<User> getUser(@PathVariable String id) {
	return userRepository.findById(id);
}
*/
@DeleteMapping("/users/delete/{id}")
public  void deleteUser(@PathVariable String id) {
	 userRepository.deleteAll();
}

@PutMapping("/users/update")
public  User updateUser(User user) {
	return userRepository.save(user);
}

@PostMapping("/users/create")
public  User postUser(@RequestBody User user) {	 
		User _user = userRepository.save(new User(user.getFname(), user.getLname()));
		return _user;
	}


}

