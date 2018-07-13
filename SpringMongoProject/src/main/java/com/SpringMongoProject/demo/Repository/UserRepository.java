package com.SpringMongoProject.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.SpringMongoProject.demo.Model.User;



public interface UserRepository extends MongoRepository<User,Long>{


}
