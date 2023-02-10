package com.example.authservice.repository;

import com.example.authservice.untity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepository extends MongoRepository<User, String> {
}
