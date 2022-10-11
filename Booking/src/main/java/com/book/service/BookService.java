package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.enity.BookingRecord;
import com.book.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookrepo;

	public BookingRecord save(BookingRecord records) {
		return bookrepo.save(records);
	}
	
	public List<BookingRecord> findAll() {
		return bookrepo.findAll();
	}

	public void delete(long id) {
		bookrepo.deleteById(id);
	}

	public Object getRecordById(String id) {
		return bookrepo.findById(id);
	} 
}
