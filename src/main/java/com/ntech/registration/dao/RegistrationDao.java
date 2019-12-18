package com.ntech.registration.dao;

import com.ntech.registration.model.Professional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationDao extends MongoRepository<Professional, String> {
}
