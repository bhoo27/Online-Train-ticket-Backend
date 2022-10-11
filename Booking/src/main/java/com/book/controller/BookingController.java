package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.enity.BookingRecord;
import com.book.service.BookService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("booking")
public class BookingController {
	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/")
	public BookingRecord addRecords(@RequestBody BookingRecord records) {
		return this.bookservice.save(records);
	}

	@PutMapping("/{id}")
	public BookingRecord updateRecords(@RequestBody BookingRecord records) {
		return this.bookservice.save(records);
	}

	@DeleteMapping("/{id}")
	public void deleteRecords(@PathVariable("id") long id) {
		this.bookservice.delete(id);
	}
	

	@GetMapping("/")
	public List<BookingRecord> getRecords() {
		return this.bookservice.findAll();
	}

		
}
