package com.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.book.enity.BookingRecord;
@Repository
public interface BookRepository extends MongoRepository<BookingRecord, String> {

	void deleteById(long id);

	
}
