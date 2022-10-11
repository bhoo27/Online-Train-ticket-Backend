package com.details.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.details.entity.PassengerDetails;
@Repository
public interface PassengerRepository extends MongoRepository<PassengerDetails, String> {

}
