package com.search.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.search.entity.Train;
@Repository
public interface TrainRepository extends MongoRepository<Train, Long> {

	Object findById(int i);

	


}
