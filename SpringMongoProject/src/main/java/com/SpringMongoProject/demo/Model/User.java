package com.SpringMongoProject.demo.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "user")
public class User {
@Id
private String id;
private String fname;
private String lname;


public User(String fname, String lname) {
	
	this.fname = fname;
	this.lname = lname;
}
public User() {
	
}

@Override
public String toString() {
	return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
}



public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

}
