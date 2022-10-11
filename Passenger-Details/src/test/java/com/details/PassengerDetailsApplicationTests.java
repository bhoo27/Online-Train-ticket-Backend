package com.details;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.details.entity.PassengerDetails;
import com.details.repository.PassengerRepository;
import com.details.service.PassengerService;

@RunWith(SpringRunner.class)
@SpringBootTest
class PassengerDetailsApplicationTests {

	@Autowired
	private PassengerService passengerservice;
	
	@MockBean
	private PassengerRepository PassengerRepo;
	
	
	//for getting passenger
	@Test
	public void getPassengerTest() {
		when(PassengerRepo.findAll()).thenReturn(Stream.
				of(new PassengerDetails("101", "Rajeev", "Kumar", "Male","2")).collect(Collectors.toList()));
		assertEquals(1, passengerservice.findAll().size());
	}
	
	// for getting all passenger detail
	@Test
	public void getAllPassengerTest() {
		List<PassengerDetails> list = new ArrayList<PassengerDetails>();
		PassengerDetails details1=new PassengerDetails("101", "Rajeev", "Kumar", "Male","2");
		PassengerDetails details2=new PassengerDetails("102", "Aakash", "Kumar", "Male","2");
		PassengerDetails details3=new PassengerDetails("103", "sunil", "Kumar", "Male","2");
		
		list.add(details1);
		list.add(details2);
		list.add(details3);
		
		when(PassengerRepo.findAll()).thenReturn(list);
		
		//test
		List<PassengerDetails> PassengerList=passengerservice.findAll();
		assertEquals(3, PassengerList.size());
		verify(PassengerRepo, times(1)).findAll();
	}
	
//	test for save PassengerDetails
	@Test
	public void saveTest() {
		PassengerDetails details=new PassengerDetails("101", "Rajeev", "Kumar", "Male","2");
		when(PassengerRepo.save(details)).thenReturn(details);
		assertEquals(details, passengerservice.save(details));
	}
	
//	test for delete PassengerDetails
	@Test
	public void deleteTest() {
		String id="101";
		PassengerDetails details=new PassengerDetails("101", "Rajeev", "Kumar", "Male","2");
		passengerservice.delete(id);
		verify(PassengerRepo,times(1)).deleteById(id);
	}
	

}
