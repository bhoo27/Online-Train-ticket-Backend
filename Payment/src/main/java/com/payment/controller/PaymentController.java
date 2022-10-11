package com.payment.controller;

import java.util.List;
import java.util.Optional;

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

import com.payment.entity.Payment;
import com.payment.service.PaymentService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("payment")
public class PaymentController {

	@Autowired
	public PaymentService service;
	
	@PostMapping("/pay")
	public Payment dopayment(@RequestBody Payment payment) {
		return service.dopay(payment);
	}
	
	@PutMapping("/{id}")
	public Payment updatepayment(@RequestBody Payment payment) {
		return service.dopay(payment);
	}
	
	@DeleteMapping("/{id}")
	public void deletepayment(@PathVariable String id) {
		this.service.delete(id);
	}

	@GetMapping("/{passengerId}")
	public Object getpaymentbyid(@PathVariable("passengerId") String passengerId ) {
		return this.service.getPaymentBypassengerId(passengerId);
		}
	
	@GetMapping("/get")
	public List<Payment> getpayments() {
		return this.service.findAll();
	}
	
	
}
