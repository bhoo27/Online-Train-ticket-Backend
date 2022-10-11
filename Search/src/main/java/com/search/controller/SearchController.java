package com.search.controller;

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

import com.search.entity.Train;
import com.search.service.SearchService;
@RestController
@RequestMapping("search")
@CrossOrigin(origins="http://localhost:3000")
public class SearchController {
	@Autowired
	private SearchService service;
	@PostMapping("/")
	public Train addTrain(@RequestBody Train flight) {
		return this.service.save(flight);
	}

	@PutMapping("/{id}")
	public Train updateTrain(@RequestBody Train flight) {
		return this.service.save(flight);
	}

	@DeleteMapping("/{id}")
	public void deleteTrain(@PathVariable long id) {
		this.service.delete(id);
	}
	
	@GetMapping("/{id}")
	public Object getTrain(@PathVariable("id") long id ) {
	return this.service.getTrainById(id);
	}
	

	@GetMapping("/")
	public List<Train> getTrain() {
		return this.service.findAll();
	}

}
