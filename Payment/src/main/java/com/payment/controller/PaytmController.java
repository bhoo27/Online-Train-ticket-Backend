package com.payment.controller;

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

import com.payment.entity.Paytm;
import com.payment.service.PaytmService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("paytm")
public class PaytmController {
	@Autowired
	private PaytmService service;
	
	@PostMapping("/pay")
	public Paytm dopaytm(@RequestBody Paytm paytm) {
		return service.dopay(paytm);
	}
	
	@PutMapping("/{id}")
	public Paytm updatepaytm(@RequestBody Paytm paytm) {
		return service.dopay(paytm);
	}
	
	@DeleteMapping("/{id}")
	public void deletepaytm(@PathVariable String id) {
		this.service.deleteById(id);
	}
	
	@GetMapping("/get")
	public List<Paytm> getpaytm() {
		return this.service.findAll();
	}

}
