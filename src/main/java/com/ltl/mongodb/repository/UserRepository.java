package com.ltl.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ltl.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
