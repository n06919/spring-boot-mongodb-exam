package com.sk.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sk.demo.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}