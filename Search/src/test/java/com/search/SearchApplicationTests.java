package com.search;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.search.entity.Train;
import com.search.repository.TrainRepository;
import com.search.service.SearchService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SearchApplicationTests {

	@Autowired
	private SearchService service;
	
	@MockBean
	private TrainRepository trainrepo;
// test fake data for get all Train	
	@Test
	public void getTrainTest() {
		when(trainrepo.findAll()).thenReturn(Stream.
				of(new Train(101, "1234", "Delhi", "Chennai", "2022-03-20")).collect(Collectors.toList()));
		assertEquals(1, service.findAll().size());
	}

	//this is also for get all Train
	@Test
	public void getAllTrainTest() {
		List<Train> list = new ArrayList<Train>();
		Train train1=new Train(101, "1234", "Delhi", "Chennai", "2022-03-20");
		Train train2=new Train(102, "5678", "Delhi", "Maharashtra", "2022-03-25");
		Train train3=new Train(103, "9101", "Delhi", "Banglore", "2022-03-30");
		
		
		list.add(train1);
		list.add(train2);
		list.add(train3);
		
		
		when(trainrepo.findAll()).thenReturn(list);
		
		//test
		List<Train> trainList=service.findAll();
		assertEquals(3, trainList.size());
		verify(trainrepo, times(1)).findAll();
	}
	
//	test for save Train
	@Test
	public void saveTest() {
		Train train=new Train(101, "1234", "Delhi", "Chennai", "2022-03-20");
		when(trainrepo.save(train)).thenReturn(train);
		assertEquals(train, service.save(train));
	}
	
//	test for delete Train
	@Test
	public void deleteTrainTest() {
		long id=101;
		Train train=new Train(101, "1234", "Delhi", "Chennai", "2022-03-20");
		service.delete(id);
		verify(trainrepo,times(1)).deleteById(id);
	}
	
}
