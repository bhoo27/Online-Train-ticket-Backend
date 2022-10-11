package com.payment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;

import com.payment.entity.Payment;
import com.payment.repostitory.PaymentRepository;
import com.payment.service.PaymentService;

@SpringBootTest
class PaymentApplicationTests {

	
	@Autowired
	public PaymentService service;
	
	@MockBean
	public PaymentRepository repository;
	
	// test for get all	
		@Test
		public void getPaymentTest() {
			when(repository.findAll()).thenReturn(Stream.
					of(new Payment("101", "123456789", "Rajeev", 898989898, 123, 2000,"1234")).collect(Collectors.toList()));
			assertEquals(1, service.findAll().size());
		}
		
		@Test
		public void getAPaymentTest() {
			when(repository.findAll()).thenReturn(Stream.
					of(new Payment("101", "123456789", "Rajeev", 898989898, 123, 2000,"1234")).collect(Collectors.toList()));
			assertEquals(1, service.findAll().size());
		}
		
		@Test
		public void getBPaymentTest() {
			when(repository.findAll()).thenReturn(Stream.
					of(new Payment("101", "123456789", "Rajeev", 898989898, 123, 2000,"1234")).collect(Collectors.toList()));
			assertEquals(1, service.findAll().size());
		}
		
		@Test
		public void getCPaymentTest() {
			when(repository.findAll()).thenReturn(Stream.
					of(new Payment("101", "123456789", "Rajeev", 898989898, 123, 2000,"1234")).collect(Collectors.toList()));
			assertEquals(1, service.findAll().size());
		}
		
		@Test
		public void getDPaymentTest() {
			when(repository.findAll()).thenReturn(Stream.
					of(new Payment("101", "123456789", "Rajeev", 898989898, 123, 2000,"1234")).collect(Collectors.toList()));
			assertEquals(1, service.findAll().size());
		}

//		//this is also for get all 
		@Test
		public void getAllPaymentTest() {
			List<Payment> list = new ArrayList<Payment>();
			Payment payment1=new Payment("101", "123456789", "Rajeev", 898989898, 123, 2000,"1234");
			Payment payment2=new Payment("102", "111213141", "Akash", 123456789, 456, 3000,"1234");
			Payment payment3=new Payment("103", "212223242", "Sunil", 765432123, 789, 2000,"1234");
			
			list.add(payment1);
			list.add(payment2);
			list.add(payment3);
			
			when(repository.findAll()).thenReturn(list);
			
			//test
			List<Payment> paymentList=service.findAll();
			assertEquals(3, paymentList.size());
			verify(repository, times(1)).findAll();
		}
		
//		@Test
//		public void savePayment() {
//			Payment payment= new Payment("102", "123456789", "Akash", 123456789, 456, 3000,"1234");
//			when(repository.save(payment)).thenReturn(payment);
//			assertEquals(payment, service.save(payment));
//		}
}
