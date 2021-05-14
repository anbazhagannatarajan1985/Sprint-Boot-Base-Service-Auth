package com.ads.mydata.api.data.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ads.mydata.api.data.entity.User;


public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(String username);
    
    List<User> findByName(String name);

	List<User> findAllByIdIn(List<String> ids);

	Optional<User> findByIsDefaultUser(boolean b);

}